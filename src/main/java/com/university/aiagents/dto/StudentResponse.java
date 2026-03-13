package com.university.aiagents.dto;

public class StudentResponse {

    private Long id;
    private String name;
    private String department;
    private int year;
    private double gpa;
    private String email;

    public StudentResponse() {}

    public StudentResponse(Long id, String name, String department, int year, double gpa, String email) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.year = year;
        this.gpa = gpa;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getYear() {
        return year;
    }

    public double getGpa() {
        return gpa;
    }

    public String getEmail() {
        return email;
    }
}