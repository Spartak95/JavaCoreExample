package serializable.еxternаlizable.example;

import java.io.*;

public class SerialDemo {
    public static void main(String[] args) {
         try {
              // սերիալիզացիա
              ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/file.txt"));
              User user = new User("Spartak", "Gareginyan", 25);
              System.out.println(user);
              out.writeObject(user);

              // դեսերիալիզացիա
              ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/file.txt"));
              User user2 = (User) in.readObject();
              System.out.println(user2);
         } catch (IOException | ClassNotFoundException e) {
             e.printStackTrace();
         }
    }
}

