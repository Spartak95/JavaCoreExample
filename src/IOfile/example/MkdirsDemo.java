package IOfile.example;

import java.io.File;

public class MkdirsDemo {
    public static void main(String[] args) {
        File file = new File("D:/Example2/Example3");
        file.mkdirs();
        System.out.println(file.getAbsolutePath());
    }
}
