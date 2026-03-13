package com.university.aiagents.service;

import com.university.aiagents.dto.ChatRequest;
import com.university.aiagents.dto.ChatResponse;
import com.university.aiagents.ai.IntentDetector;
import com.university.aiagents.entity.Student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class AIService {

    private final RestTemplate restTemplate;
    private final StudentService studentService;

    @Value("${gemini.api.key}")
    private String apiKey;

    public AIService(RestTemplate restTemplate, StudentService studentService) {
        this.restTemplate = restTemplate;
        this.studentService = studentService;
    }

    public ChatResponse processQuery(ChatRequest request) {

        String message = request.getMessage();
        String intent = IntentDetector.detectIntent(message);

        // 🔹 DATABASE PART
        if(intent.equals("STUDENT_QUERY")) {

            List<Student> students = studentService.getStudents();

            if(students.isEmpty())
                return new ChatResponse("No students found in the database.");

            StringBuilder result = new StringBuilder("Students in database:\n");

            for(Student s : students){
                result.append(s.getName())
                        .append(" - ")
                        .append(s.getDepartment())
                        .append(" (GPA: ")
                        .append(s.getGpa())
                        .append(")\n");
            }

            return new ChatResponse(result.toString());
        }

        // 🔹 AI PART
        String url =
                "https://generativelanguage.googleapis.com/v1/models/gemini-2.5-flash-lite:generateContent?key=" + apiKey;

        Map<String, Object> body = Map.of(
                "contents", new Object[]{
                        Map.of(
                                "parts", new Object[]{
                                        Map.of("text", message)
                                }
                        )
                }
        );

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, Object>> entity =
                new HttpEntity<>(body, headers);

        try {

            ResponseEntity<Map> response =
                    restTemplate.postForEntity(url, entity, Map.class);

            Map candidate =
                    (Map)((Map)((java.util.List)response.getBody()
                            .get("candidates")).get(0))
                            .get("content");

            Map part =
                    (Map)((java.util.List)candidate.get("parts")).get(0);

            String reply = part.get("text").toString();

            return new ChatResponse(reply);

        } catch (Exception e) {

            return new ChatResponse("Gemini error: " + e.getMessage());
        }
    }
}