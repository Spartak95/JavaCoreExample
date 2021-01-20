package IOfile.example;

import java.io.File;

public class ExistsDemo {
    public static void main(String[] args) {
         File file = new File("D:/Example/Example2/1.txt");
         File file2 = new File("D:/Example/Example2/2.txt");
         File file3 = new File("D:/Example/Example2");
         System.out.println(file.exists()); // true
         System.out.println(file2.exists()); // false
         System.out.println(file3.exists()); // true
    }
}
