package IOfile.example;

import java.io.File;

public class ListFilenameFilterDemo  {
    public static void main(String[] args) {
         File file = new File("D:/Music/");
         FilterDemo filterDemo = new FilterDemo();
         String[] str = file.list(filterDemo);
         for (int i = 0; i < str.length; i++) {
             System.out.println(str[i]);
         }
    }
}
