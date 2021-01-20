package IOfile.example;

import java.io.File;

public class CanWriteDemo {
    public static void main(String[] args) {
         String[] path = {"D:/Example/text.txt", "D:/Example", "D:/Example/text"};

         for (String paths : path) {

              File file = new File(paths);

              if (file.canWrite()) {
                  System.out.println(paths + ": կարող է գրանցվել");
              } else {
                  System.out.println(paths + ": չի կարող գրանցվել");
              }

         }
    }
}
