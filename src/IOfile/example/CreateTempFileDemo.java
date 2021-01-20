package IOfile.example;

import java.io.File;
import java.io.IOException;

public class CreateTempFileDemo {
    public static void main(String[] args) {
         try {
             // ստեղծվում է ժամանակավոր ֆայլ
             File file = File.createTempFile("apa", ".txt");
             // եթե suffix պարամետրը ընդունում է null,
             // ապա ստեղծվում է .tmp ընդլայնմամբ ժամանակավոր ֆայլ
             File file2 = File.createTempFile("api", null);

             System.out.println("Դեպի ֆայլ տանող ուղին: " + file.getAbsolutePath());
             System.out.println("Դեպի ֆայլ տանող ուղին: " + file2.getAbsolutePath());

         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
