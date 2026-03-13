package com.university.aiagents.controller;

import com.university.aiagents.entity.Exam;
import com.university.aiagents.service.ExamService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/exams")
public class ExamController {

    private final ExamService examService;

    public ExamController(ExamService examService) {
        this.examService = examService;
    }

    @PostMapping
    public Exam addExam(@RequestBody Exam exam) {
        return examService.saveExam(exam);
    }

    @GetMapping
    public List<Exam> getExams() {
        return examService.getExams();
    }
}