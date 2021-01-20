package IOfile.example;

import java.io.File;

public class CanExecuteDemo2 {

    public static void main(String[] args) {
         String[] path = {"D:/Example/text.txt", "D:/Example2", "D:/Example/text"};

         for (String paths : path) {

              File file = new File(paths);

              if (file.canExecute()) {
                   System.out.println(paths + ": կարող է կատարվել");
              } else {
                  System.out.println(paths + ": չի կարող կատարվել");
              }

         }
    }

}
