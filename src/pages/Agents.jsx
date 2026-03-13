import { useEffect, useState } from "react";
import { getAgents } from "../services/agentService";

function Agents() {
  const [agents, setAgents] = useState([]);

  useEffect(() => {
    loadAgents();
  }, []);

  const loadAgents = async () => {
    const data = await getAgents();
    setAgents(data);
  };

  return (
    <div>
      <h2>AI Agents</h2>

      <ul>
        {agents.map((a) => (
          <li key={a.id}>
            {a.name} - {a.description}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Agents;