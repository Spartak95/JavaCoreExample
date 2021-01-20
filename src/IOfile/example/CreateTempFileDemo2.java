package IOfile.example;

import java.io.File;
import java.io.IOException;

public class CreateTempFileDemo2 {
    public static void main(String[] args) {
        try {
            // ստեղծվում է ժամանակավոր ֆայլ
            File file = File.createTempFile("apa", ".txt", new File("D:/Example/"));
            // եթե suffix պարամետրը ընդունում է null,
            // ապա ստեղծվում է .tmp ընդլայնմամբ ժամանակավոր ֆայլ
            File file2 = File.createTempFile("api", null, new File("D:/Example/"));

            System.out.println("Դեպի ֆայլ տանող ուղին: " + file.getAbsolutePath());
            System.out.println("Դեպի ֆայլ տանող ուղին: " + file2.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
