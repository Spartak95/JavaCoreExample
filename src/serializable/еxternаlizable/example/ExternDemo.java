package serializable.еxternаlizable.example;

import java.io.*;

public class ExternDemo {
    public static void main(String[] args) {
        try {
             // սերիալիզացիա
             User2 user = new User2("Spartak", "Gareginyan", "032654898");
             System.out.println(user);
             ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/file.txt"));
             out.writeObject(user);

             // դեսերիալիզացիա
             ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/file.txt"));
             User2 user2 = (User2) in.readObject();
             System.out.println(user2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
