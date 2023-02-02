// package Oophw4;

// import File2send;
/**
 * Имитация чата, главная задача составить архитектуру классов и методов
 */
public class ProChatik {

  public static void main(String[] args) {
    Chat gb = new Chat();
    FileSend f = new FileSend("something.jpeg");

    User client1 = new User("Вася", gb);
    User client2 = new User("Маша", gb);
    User client4 = new User("Вальдемар", gb);

    gb.appendClient(client1);
    gb.appendClient(client2);
    gb.appendClient(client4);

    client1.sendMsg("привет всем!");

    client2.sendMsg("ку-ку!");

    User client3 = new User("Коля", gb);
    gb.appendClient(client3);

    client3.sendMsg("hello world!");
    client3.sendMsg(f, 123.4);   // kb?

  }
}

