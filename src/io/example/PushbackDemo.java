package io.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackDemo {
    public static void main(String[] args) {
        try {
            byte[] b = " String".getBytes();
            PushbackInputStream inputStream = new PushbackInputStream(new FileInputStream("D:/file.txt"), 25);
            int a = 0;
            int c = 0;
            while ((a = inputStream.read()) != -1){
                System.out.print((char) a);
            }
            inputStream.unread(b);
            while ((c = inputStream.read()) != -1){
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
