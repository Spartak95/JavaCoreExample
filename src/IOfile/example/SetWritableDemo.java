package IOfile.example;

import java.io.File;

public class SetWritableDemo {
    public static void main(String[] args) {
         File file = new File("D:/Example/text.txt");
         file.setWritable(false);
         System.out.println(file.canWrite());
    }
}
