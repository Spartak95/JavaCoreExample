package IOfile.example;

import java.io.File;

public class SetExecutableDemo {
    public static void main(String[] args) {
         File file = new File("D:/Example/text.txt");
         boolean a = file.setExecutable(true);
         System.out.println(a);
         boolean b = file.canExecute();
         System.out.println(b);
    }
}
