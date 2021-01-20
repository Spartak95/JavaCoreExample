package IOfile.example;

import java.io.File;

public class DeleteDemo {
    public static void main(String[] args) {
        File file = null;
        try {
            // որպեսզի deleteOnExit() մեթոդը ջնջի թղթապանակին,
            // պետք է այդ թղթապանակը լինի դատարկ
            file = new File("D:/Example/Example2/1.txt");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getAbsoluteFile());
            file.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
