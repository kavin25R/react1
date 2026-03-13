package com.university.aiagents.service;

import com.university.aiagents.entity.Exam;
import com.university.aiagents.repository.ExamRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExamService {

    private final ExamRepository examRepository;

    public ExamService(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    public Exam saveExam(Exam exam) {
        return examRepository.save(exam);
    }

    public List<Exam> getExams() {
        return examRepository.findAll();
    }
}