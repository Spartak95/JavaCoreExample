package IOfile.example;

import java.io.File;
import java.nio.file.Path;

public class MkdirDemo {
    public static void main(String[] args) {
         File file = new File("D:/Example2/");
         file.mkdir();
         System.out.println(file.getAbsolutePath());
    }
}
