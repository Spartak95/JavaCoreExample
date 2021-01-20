package IOfile.example;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class LastModifiedDemo {
    public static void main(String[] args) {
         File file = new File("D:/Example/Example2/1.txt");
         long mil = file.lastModified();
         Date date = new Date(mil);
         System.out.println(date);

         LocalDate localDate = LocalDate.now();
         System.out.println("localDate = " + localDate);

         LocalTime localTime = LocalTime.now();
         System.out.println("localTime = " + localTime);
    }
}
