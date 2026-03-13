package com.university.aiagents.ai;

import com.university.aiagents.dto.ChatRequest;
import com.university.aiagents.dto.ChatResponse;
import org.springframework.stereotype.Component;

@Component
public class AgentManager {

    private final IntentDetector intentDetector;
    private final ToolExecutor toolExecutor;

    public AgentManager(IntentDetector intentDetector, ToolExecutor toolExecutor) {
        this.intentDetector = intentDetector;
        this.toolExecutor = toolExecutor;
    }

    public ChatResponse handleRequest(ChatRequest request) {

        String intent = intentDetector.detectIntent(request.getMessage());

        String result = toolExecutor.execute(intent, request.getMessage());

        return new ChatResponse(result);
    }
}