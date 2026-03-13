function Dashboard() {
  return (
    <div>
      <h2>University Dashboard</h2>

      <div className="cards">
        <div className="card">
          <h3>Students</h3>
          <p>Manage student records</p>
        </div>

        <div className="card">
          <h3>Faculty</h3>
          <p>Manage faculty profiles</p>
        </div>

        <div className="card">
          <h3>Courses</h3>
          <p>Manage courses and curriculum</p>
        </div>

        <div className="card">
          <h3>AI Agents</h3>
          <p>Control university AI agents</p>
        </div>
      </div>
    </div>
  );
}

export default Dashboard;