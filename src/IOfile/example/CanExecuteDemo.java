package IOfile.example;

import java.io.File;
import java.util.ArrayList;

public class CanExecuteDemo {
    public static void main(String[] args) {

        try {
            File file = new File("D:/Example/text.txt");
            if (file.canExecute()) {
                System.out.println("Կարող է կատարվել");
            } else {
                System.out.println("Չի կարող կատարվել");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
