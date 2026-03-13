import api from "../api/api";

export const sendChatMessage = async (message) => {
  const response = await api.post("/chat", {
    message: message
  });

  return response.data;
};