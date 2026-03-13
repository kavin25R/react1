CREATE TABLE agent (
 id BIGINT PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(255),
 description VARCHAR(500),
 domain VARCHAR(255),
 instructions TEXT
);

CREATE TABLE student (
 id BIGINT PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(255),
 department VARCHAR(255),
 year INT,
 gpa DOUBLE,
 email VARCHAR(255),
 joining_date VARCHAR(50)
);

CREATE TABLE faculty (
 id BIGINT PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(255),
 department VARCHAR(255),
 designation VARCHAR(255),
 email VARCHAR(255)
);

CREATE TABLE course (
 id BIGINT PRIMARY KEY AUTO_INCREMENT,
 course_name VARCHAR(255),
 department VARCHAR(255),
 semester INT,
 credits INT
);

CREATE TABLE attendance (
 id BIGINT PRIMARY KEY AUTO_INCREMENT,
 student_id BIGINT,
 course_name VARCHAR(255),
 date VARCHAR(50),
 present BOOLEAN
);

CREATE TABLE exam (
 id BIGINT PRIMARY KEY AUTO_INCREMENT,
 course_name VARCHAR(255),
 student_id BIGINT,
 marks DOUBLE,
 exam_type VARCHAR(100)
);