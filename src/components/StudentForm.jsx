import { useState } from "react";
import { createStudent } from "../services/studentService";

function StudentForm({ refresh }) {
  const [student, setStudent] = useState({
    name: "",
    department: "",
    year: "",
    gpa: ""
  });

  const handleChange = (e) => {
    setStudent({
      ...student,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    await createStudent(student);

    setStudent({
      name: "",
      department: "",
      year: "",
      gpa: ""
    });

    refresh();
  };

  return (
    <form onSubmit={handleSubmit}>
      <h3>Add Student</h3>

      <input
        name="name"
        placeholder="Name"
        value={student.name}
        onChange={handleChange}
      />

      <input
        name="department"
        placeholder="Department"
        value={student.department}
        onChange={handleChange}
      />

      <input
        name="year"
        placeholder="Year"
        value={student.year}
        onChange={handleChange}
      />

      <input
        name="gpa"
        placeholder="GPA"
        value={student.gpa}
        onChange={handleChange}
      />

      <button type="submit">Add Student</button>
    </form>
  );
}

export default StudentForm;