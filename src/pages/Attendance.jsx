import { useEffect, useState } from "react";
import { getAttendance } from "../services/attendanceService";

function Attendance() {
  const [attendance, setAttendance] = useState([]);

  useEffect(() => {
    loadAttendance();
  }, []);

  const loadAttendance = async () => {
    const data = await getAttendance();
    setAttendance(data);
  };

  return (
    <div>
      <h2>Attendance</h2>

      <ul>
        {attendance.map((a) => (
          <li key={a.id}>
            Student ID: {a.studentId} - {a.present}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Attendance;