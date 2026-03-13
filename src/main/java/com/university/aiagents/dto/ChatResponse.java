package com.university.aiagents.dto;

public class ChatResponse {

    private String reply;

    public ChatResponse() {}

    public ChatResponse(String reply) {
        this.reply = reply;
    }

    public ChatResponse processQuery(ChatRequest request) {
        return new ChatResponse("Backend is working");
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}