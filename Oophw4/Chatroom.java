
interface Chatroom {

  void sendMessage(String msg, User user);

  void appendClient(User user);

  void sendMessage(FileSend file, Double fileSize, User user);

}