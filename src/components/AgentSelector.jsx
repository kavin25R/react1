import { useEffect, useState } from "react";
import { getAgents } from "../services/agentService";

function AgentSelector({ onSelect }) {
  const [agents, setAgents] = useState([]);

  useEffect(() => {
    loadAgents();
  }, []);

  const loadAgents = async () => {
    const data = await getAgents();
    setAgents(data);
  };

  return (
    <select onChange={(e) => onSelect(e.target.value)}>
      <option>Select Agent</option>

      {agents.map((agent) => (
        <option key={agent.id} value={agent.id}>
          {agent.name}
        </option>
      ))}
    </select>
  );
}

export default AgentSelector;