package com.university.aiagents.utils;

import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;

public class ResponseUtil {

    public static ResponseEntity<Object> success(Object data) {

        Map<String, Object> response = new HashMap<>();

        response.put("status", "success");
        response.put("data", data);

        return ResponseEntity.ok(response);
    }

    public static ResponseEntity<Object> error(String message) {

        Map<String, Object> response = new HashMap<>();

        response.put("status", "error");
        response.put("message", message);

        return ResponseEntity.badRequest().body(response);
    }
}