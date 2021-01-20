package buffer.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

public class ByteBufferDemo {
    public static void main(String[] args) {
         String str = "Hello";
         String str2 = " World";
         byte[] b = str.getBytes();
         byte[] b2 = str2.getBytes();
         // բուֆերը կարող է պահել 1024 հատ էլեմենտ
         ByteBuffer buffer = ByteBuffer.allocate(12);
         buffer.put(b);
         buffer.put(b2);
         System.out.println("Position " + buffer.position());
         System.out.println("Limit " + buffer.limit());
         System.out.println("Capacity " + buffer.capacity());
         buffer.flip();
         //buffer.rewind();
         System.out.println("Position " + buffer.position());
         System.out.println("Limit " + buffer.limit());
         System.out.println("Capacity " + buffer.capacity());
         try {
              RandomAccessFile file = new RandomAccessFile("D:/file.txt", "rw");
              FileChannel channel = file.getChannel();
              channel.write(buffer);
              channel.close();
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
