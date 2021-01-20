package IOfile.example;

import java.io.File;

public class CanReadDemo {
    public static void main(String[] args) {
        String[] path = {"D:/Example/text.txt", "D:/Example2", "D:/Example/text"};

        for (String paths : path) {

            File file = new File(paths);

            if (file.canRead()) {
                System.out.println(paths + ": կարող է ընթերցվել");
            } else {
                System.out.println(paths + ": չի կարող ընթերցվել");
            }

        }
    }
}
