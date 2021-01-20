package buffer.example;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ByteBufferDemo2 {
    public static void main(String[] args) {
        try {
            String str = "Hello";
            String str2 = " World";
            String str3 = "Hello World";
            byte[] b = str.getBytes();
            byte[] b2 = str2.getBytes();
            byte[] b3 = str3.getBytes();
            ByteBuffer buffer = ByteBuffer.allocate(11);
            buffer.put(b);
            buffer.put(b2);
            //buffer.put(b3);
            buffer.rewind();
            Path path = Paths.get("D:/file2.txt");
            FileChannel channel2 = FileChannel.open(path, StandardOpenOption.WRITE);
            channel2.write(buffer);
            channel2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
