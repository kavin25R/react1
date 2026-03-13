package com.university.aiagents.utils;

public class AgentHelper {

    public static boolean containsIgnoreCase(String text, String keyword) {

        return text.toLowerCase().contains(keyword.toLowerCase());
    }

    public static String cleanMessage(String message) {

        return message.trim().toLowerCase();
    }

    public static boolean isStudentQuery(String message) {

        message = message.toLowerCase();

        return message.contains("student")
                || message.contains("enroll")
                || message.contains("gpa");
    }

    public static boolean isCourseQuery(String message) {

        message = message.toLowerCase();

        return message.contains("course")
                || message.contains("semester")
                || message.contains("credits");
    }
}