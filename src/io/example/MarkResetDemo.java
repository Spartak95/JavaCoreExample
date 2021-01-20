package io.example;

import java.io.*;

public class MarkResetDemo {
    public static void main(String[] args) {

         try(FileInputStream file = new FileInputStream("D:/text.txt");
             BufferedInputStream bin = new BufferedInputStream(file)) {
                  System.out.println((char) bin.read());
                  System.out.println((char) bin.read());
                  file.mark(file.available());
                  System.out.println(file.markSupported());
                  System.out.println((char) bin.read());
                  System.out.println((char) bin.read());
                  System.out.println((char) bin.read());
                  if (file.markSupported()){
                       file.reset();
                       System.out.println((char) bin.read());
                       System.out.println((char) bin.read());
                       System.out.println((char) bin.read());
                  }

         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
