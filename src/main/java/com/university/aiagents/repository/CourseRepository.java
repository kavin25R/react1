package com.university.aiagents.repository;

import com.university.aiagents.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findBySemester(int semester);

    List<Course> findByDepartment(String department);

}