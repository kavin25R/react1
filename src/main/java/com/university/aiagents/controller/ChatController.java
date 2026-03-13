package com.university.aiagents.controller;

import com.university.aiagents.dto.ChatRequest;
import com.university.aiagents.dto.ChatResponse;
import com.university.aiagents.service.AIService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final AIService aiService;

    public ChatController(AIService aiService) {
        this.aiService = aiService;
    }

    @PostMapping
    public ChatResponse chat(@RequestBody ChatRequest request) {
        return aiService.processQuery(request);
    }
}