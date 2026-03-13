INSERT INTO student (name, department, year, gpa, email, joining_date)
VALUES ('Arjun', 'CSE', 4, 8.5, 'arjun@gmail.com', '2023-06-01');

INSERT INTO student (name, department, year, gpa, email, joining_date)
VALUES ('Kavin', 'IT', 3, 7.9, 'kavin@gmail.com', '2024-06-01');

INSERT INTO faculty (name, department, designation, email)
VALUES ('Prof Kumar', 'CSE', 'Associate Professor', 'kumar@college.edu');

INSERT INTO course (course_name, department, semester, credits)
VALUES ('Data Structures', 'CSE', 3, 4);

INSERT INTO agent (name, description, domain, instructions)
VALUES (
 'Student Management Agent',
 'Handles student records and academic details',
 'Student',
 'Manage student enrollment, update records, and retrieve student lists'
);