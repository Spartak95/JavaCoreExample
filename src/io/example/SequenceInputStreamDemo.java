package io.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
         Vector<String> list = new Vector<>();
         list.add("D:/file.txt");
         list.add("D:/file2.txt");
         list.add("D:/file3.txt");

         InputStrDemo str = new InputStrDemo(list);

         SequenceInputStream sis = new SequenceInputStream(str);

         try {
             int c = 0;
             while ((c = sis.read()) != -1){
                 System.out.print((char) c);
             }
         } catch (IOException e) {
            e.printStackTrace();
         }

         System.out.println();

         FileInputStream f = null;
         FileInputStream f2 = null;

         try {
              f = new FileInputStream("D:/file.txt");
              f2 = new FileInputStream("D:/file2.txt");
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }

         SequenceInputStream sis2 = new SequenceInputStream(f, f2);

         try {
            int c2 = 0;
            while ((c2 = sis2.read()) != -1){
                System.out.print((char) c2);
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
    }
}
