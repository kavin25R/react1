import api from "../api/api";

export const getFaculty = async () => {
  const response = await api.get("/faculty");
  return response.data;
};

export const createFaculty = async (faculty) => {
  const response = await api.post("/faculty", faculty);
  return response.data;
};

export const updateFaculty = async (id, faculty) => {
  const response = await api.put(`/faculty/${id}`, faculty);
  return response.data;
};

export const deleteFaculty = async (id) => {
  const response = await api.delete(`/faculty/${id}`);
  return response.data;
};