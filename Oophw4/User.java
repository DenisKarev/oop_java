class User {

    public String name;
    private Chatroom chatroom;
  
    public User(String name, Chatroom chatroom) {
      this.name = name;
      this.chatroom = chatroom;
    }
  
    void printMessage(String msg) {
      System.out.printf("Чат %s: %s\n", name, msg);
    }
  
    void printMessage(String msg, Double f) {
      System.out.printf("Чат %s: %s\n", name, msg, f);
    }
  
    void sendMsg(String text) {
      chatroom.sendMessage(text, this);
    }
  
    void sendMsg(FileSend file, Double fileSize) {
      chatroom.sendMessage(file, fileSize, this);
    }
  
  }
