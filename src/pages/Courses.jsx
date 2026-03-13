import { useEffect, useState } from "react";
import { getCourses } from "../services/courseService";

function Courses() {
  const [courses, setCourses] = useState([]);

  useEffect(() => {
    loadCourses();
  }, []);

  const loadCourses = async () => {
    const data = await getCourses();
    setCourses(data);
  };

  return (
    <div>
      <h2>Courses</h2>

      <ul>
        {courses.map((c) => (
          <li key={c.id}>
            {c.courseName} - Semester {c.semester}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Courses;