package io.example;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedIODemo {
    public static void main(String[] args) {
         String str = "Hello World";
         byte[] b = str.getBytes();
         int c = 0;

         try(PipedInputStream in = new PipedInputStream();
              PipedOutputStream out = new PipedOutputStream()) {

              in.connect(out);

              out.write(b);

              while ((c = in.read()) != -1){
                  System.out.print((char) c);
              }

         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
