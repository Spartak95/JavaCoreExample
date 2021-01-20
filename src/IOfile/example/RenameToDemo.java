package IOfile.example;

import java.io.File;

public class RenameToDemo {
    public static void main(String[] args) {
         File file = new File("D:/Example/text.txt");
         // renameTo() մեթոդը փոխում է կանչող
         // օբյեկտի հետ կապված ֆայլի անունը
         file.renameTo(new File("D:/Example/text2.txt"));
         System.out.println(file.getAbsolutePath());
    }
}
