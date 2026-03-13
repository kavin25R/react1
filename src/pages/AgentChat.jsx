import { useState } from "react";
import { sendChatMessage } from "../services/chatService";

function AgentChat() {
  const [message, setMessage] = useState("");
  const [chat, setChat] = useState([]);

  const handleSend = async () => {
    if (!message.trim()) return;

    /*const response = await sendChatMessage(message);

    setChat([
      ...chat,
      { role: "User", text: message },
      { role: "AI", text: response.reply }
    ]);*/


    try {
  const response = await sendChatMessage(message);

  setChat(prev => [
    ...prev,
    { role: "user", text: message },
    { role: "ai", text: response.reply }
  ]);
} catch (error) {
  console.error("Chat error:", error);
}

    setMessage("");
  };

  return (
    <div>
      <h2>AI Agent Chat</h2>

      <div className="chatbox">
        {chat.map((c, index) => (
          <p key={index}>
            <b>{c.role}:</b> {c.text}
          </p>
        ))}
      </div>

      <input
        value={message}
        onChange={(e) => setMessage(e.target.value)}
        placeholder="Ask the AI agent..."
      />

      <button onClick={handleSend}>Send</button>
    </div>
  );
}

export default AgentChat;