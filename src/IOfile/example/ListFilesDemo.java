package IOfile.example;

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
         File file = new File("D:/Music");
         File[] f = file.listFiles();
         for (int i = 0; i < f.length; i++) {
             System.out.println(f[i]);
         }
    }
}
