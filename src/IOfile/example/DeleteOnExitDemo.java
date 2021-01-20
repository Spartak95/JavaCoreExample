package IOfile.example;

import java.io.File;
import java.io.IOException;

public class DeleteOnExitDemo {
    public static void main(String[] args) {
         File file = null;
         try {
              file = File.createTempFile("api", null, new File("D:/Example"));
              System.out.println("Դեպի ֆայլ տանող ուղին: " + file.getAbsolutePath());
              file.deleteOnExit();
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
