package IOfile.example;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
    public static void main(String[] args) {

        File file = new File("D:/Example/text.txt");
        File file2 = new File("D:/Example/text2.txt");

        try {
             boolean newFile = file.createNewFile();
             boolean newFile2 = file2.createNewFile();
             System.out.println(newFile);
             System.out.println(newFile2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
