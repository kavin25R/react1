function StudentTable({ students }) {
  return (
    <table border="1">
      <thead>
        <tr>
          <th>Name</th>
          <th>Department</th>
          <th>Year</th>
          <th>GPA</th>
        </tr>
      </thead>

      <tbody>
        {students.map((s) => (
          <tr key={s.id}>
            <td>{s.name}</td>
            <td>{s.department}</td>
            <td>{s.year}</td>
            <td>{s.gpa}</td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}

export default StudentTable;