package IOfile.example;

import java.io.File;

public class IsAbsoluteDemo {
    public static void main(String[] args) {
         File file = new File("D:/Example/text.txt");
         boolean b = file.isAbsolute();
         System.out.println(b);
    }
}
