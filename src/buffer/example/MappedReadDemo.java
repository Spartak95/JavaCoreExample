package buffer.example;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedReadDemo {
    public static void main(String[] args) throws IOException {
         Path path = Paths.get("D:/file.txt");
         FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);
         MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
         while (map.hasRemaining()){
             System.out.print((char) map.get());
         }
    }
}

