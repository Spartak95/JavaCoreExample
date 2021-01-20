package IOfile.example;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class IsDirectoryDemo {
    public static void main(String[] args) {
        File file = new File("D:/Example");
        File file2 = new File("D:/Example/text.txt");
        System.out.println(file.isDirectory());
        System.out.println(file2.isDirectory());
    }
}
