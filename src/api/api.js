import axios from "axios";

// Create axios instance
const api = axios.create({
  baseURL: "http://localhost:8080/api", // Spring Boot backend URL
  headers: {
    "Content-Type": "application/json",
  },
});

// Optional: Request interceptor
api.interceptors.request.use(
  (config) => {
    console.log("API Request:", config.url);
    return config;
  },
  (error) => {
    return Promise.reject(error);
  }
);

// Optional: Response interceptor
api.interceptors.response.use(
  (response) => {
    return response;
  },
  (error) => {
    console.error("API Error:", error);
    return Promise.reject(error);
  }
);

export default api;