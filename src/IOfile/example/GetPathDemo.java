package IOfile.example;

import java.io.File;
import java.nio.file.Path;

public class GetPathDemo {
    public static void main(String[] args) {
        File file = new File("D:/Example/text.txt");
        Path path = file.toPath();
        System.out.println(path);
        System.out.println(file.getPath());
    }
}
