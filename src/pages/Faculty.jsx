import { useEffect, useState } from "react";
import { getFaculty } from "../services/facultyService";

function Faculty() {
  const [faculty, setFaculty] = useState([]);

  useEffect(() => {
    loadFaculty();
  }, []);

  const loadFaculty = async () => {
    const data = await getFaculty();
    setFaculty(data);
  };

  return (
    <div>
      <h2>Faculty</h2>

      <ul>
        {faculty.map((f) => (
          <li key={f.id}>
            {f.name} - {f.department}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Faculty;