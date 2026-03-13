import { Link } from "react-router-dom";

function Sidebar() {
  return (
    <div className="sidebar">
      <h3>Menu</h3>

      <Link to="/">Dashboard</Link>
      <Link to="/students">Students</Link>
      <Link to="/faculty">Faculty</Link>
      <Link to="/courses">Courses</Link>
      <Link to="/attendance">Attendance</Link>
      <Link to="/exams">Exams</Link>
      <Link to="/agents">Agents</Link>
      <Link to="/chat">AI Chat</Link>
    </div>
  );
}

export default Sidebar;