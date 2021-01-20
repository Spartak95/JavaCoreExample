package io.example;

import java.io.*;
import java.nio.charset.Charset;

public class WriteDemo {
    public static void main(String[] args) {
        try(FileWriter inputStream = new FileWriter("D:/file1.txt", Charset.forName("UTF-8"))) {
            String str = "ABCD";
            byte[] b = str.getBytes();

            inputStream.write(str);
            //inputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
