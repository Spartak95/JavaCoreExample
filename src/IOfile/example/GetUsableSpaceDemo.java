package IOfile.example;

import java.io.File;

public class GetUsableSpaceDemo {
    public static void main(String[] args) {
         File file = new File("D:/Example/text.txt");
         long space = file.getUsableSpace();
         long space2 = file.getTotalSpace();
         System.out.println("space = " + space);
         System.out.println("space2 = " + space2);
    }
}
