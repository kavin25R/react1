import api from "../api/api";

export const getAgents = async () => {
  const response = await api.get("/agents");
  return response.data;
};

export const createAgent = async (agent) => {
  const response = await api.post("/agents", agent);
  return response.data;
};

export const updateAgent = async (id, agent) => {
  const response = await api.put(`/agents/${id}`, agent);
  return response.data;
};

export const deleteAgent = async (id) => {
  const response = await api.delete(`/agents/${id}`);
  return response.data;
};