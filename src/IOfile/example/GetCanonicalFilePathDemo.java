package IOfile.example;

import java.io.File;
import java.io.IOException;

public class GetCanonicalFilePathDemo {
    public static void main(String[] args) {
         try {
              File file = new File("D:/Example/text.txt");
              File file2 = file.getCanonicalFile();
              String file3 = file.getCanonicalPath();
              System.out.println(file2.getPath());
              System.out.println(file3);
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
