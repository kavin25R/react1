package com.university.aiagents.ai;

import com.university.aiagents.service.*;
import org.springframework.stereotype.Component;

@Component
public class ToolExecutor {

    private final StudentService studentService;
    private final CourseService courseService;
    private final FacultyService facultyService;
    private final AttendanceService attendanceService;
    private final ExamService examService;

    public ToolExecutor(StudentService studentService,
                        CourseService courseService,
                        FacultyService facultyService,
                        AttendanceService attendanceService,
    ExamService examService) {

        this.studentService = studentService;
        this.courseService = courseService;
        this.facultyService=facultyService;
        this.attendanceService=attendanceService;
        this.examService=examService;
    }

    public String execute(String intent, String message) {

        switch (intent) {

            case "STUDENT_QUERY":
                return studentService.getStudents().toString();

            case "COURSE_QUERY":
                return courseService.getCourses().toString();

            case "FACULTY_QUERY":
                return facultyService.getFaculty().toString();

            case  "ATTENDANCE_QUERY":
                return attendanceService.getAttendance().toString();

            case  "EXAM_QUERY":
                return examService.getExams().toString();

            case "CREATE_STUDENT":
                return "Student creation detected (logic can be added)";

            default:
                return "Sorry, I could not understand your request.";
        }
    }
}