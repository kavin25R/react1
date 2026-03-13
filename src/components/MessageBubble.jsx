function MessageBubble({ message }) {
  const isUser = message.role === "user";

  return (
    <div className={isUser ? "user-message" : "ai-message"}>
      <b>{message.role}:</b> {message.text}
    </div>
  );
}

export default MessageBubble;