import api from "../api/api";

export const getExams = async () => {
  const response = await api.get("/exams");
  return response.data;
};

export const createExam = async (exam) => {
  const response = await api.post("/exams", exam);
  return response.data;
};

export const updateExam = async (id, exam) => {
  const response = await api.put(`/exams/${id}`, exam);
  return response.data;
};

export const deleteExam = async (id) => {
  const response = await api.delete(`/exams/${id}`);
  return response.data;
};