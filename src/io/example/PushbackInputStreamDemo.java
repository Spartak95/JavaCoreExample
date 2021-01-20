package io.example;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamDemo {
    public static void main(String[] args) {
         try {
               String st = "Hello";
               byte[] b = st.getBytes();

               ByteArrayInputStream inputStream = new ByteArrayInputStream(b);
               PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream);

               for (int i = 0; i < b.length; i++){
                   System.out.print((char)pushbackInputStream.read());
               }

               System.out.println();

               pushbackInputStream.unread(72);
               System.out.print((char)pushbackInputStream.read());
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
