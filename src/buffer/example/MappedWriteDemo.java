package buffer.example;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedWriteDemo {
    public static void main(String[] args) throws IOException {
         byte[] b = "Hello World".getBytes();
         Path path = Paths.get("D:/f.txt");
         FileChannel channel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.READ);
         MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0, 11);
         map.put(b);
    }
}
