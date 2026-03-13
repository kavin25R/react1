package com.university.aiagents.ai;

import org.springframework.stereotype.Component;

@Component
public class PromptBuilder {

    public String buildSystemPrompt() {

        return """
        You are a university management AI agent.

        You help manage:
        - Students
        - Faculty
        - Courses
        - Attendance
        - Exams

        Respond clearly and perform actions when needed.
        """;
    }

    public String buildUserPrompt(String message) {

        return "User Query: " + message;
    }
}