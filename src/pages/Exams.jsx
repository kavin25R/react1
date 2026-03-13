import { useEffect, useState } from "react";
import { getExams } from "../services/examService";

function Exams() {
  const [exams, setExams] = useState([]);

  useEffect(() => {
    loadExams();
  }, []);

  const loadExams = async () => {
    const data = await getExams();
    setExams(data);
  };

  return (
    <div>
      <h2>Exams</h2>

      <ul>
        {exams.map((e) => (
          <li key={e.id}>
            <tb><tr><td>{e.studentId}-</td><td>{e.courseName} -</td><td> {e.marks}</td></tr></tb>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Exams;