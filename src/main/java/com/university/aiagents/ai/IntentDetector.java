package com.university.aiagents.ai;

import org.springframework.stereotype.Component;

@Component
public class IntentDetector {

    public static String detectIntent(String message){

        message = message.toLowerCase();

        if(message.contains("student") || message.contains("students"))
            return "STUDENT_QUERY";

        if(message.contains("course") || message.contains("courses"))
            return "COURSE_QUERY";

        if(message.contains("faculty") || message.contains("faculties"))
            return "FACULTY_QUERY";

        if(message.contains("attendance") || message.contains("attendances"))
            return "ATTENDANCE_QUERY";

        if(message.contains("exam") || message.contains("exams"))
            return "EXAM_QUERY";

        return "AI_CHAT";
    }
}