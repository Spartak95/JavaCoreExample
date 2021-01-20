package files.example;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.util.Iterator;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
         Path files = Files.copy(Paths.get("D:/file.txt"), Paths.get("D:/Example/t.txt"), StandardCopyOption.REPLACE_EXISTING);
         Path path = Paths.get("D:/g.txt");
         byte[] b = " Hello World".getBytes();
         ByteBuffer buffer = ByteBuffer.allocate(20);
         buffer.put(b);
         buffer.rewind();
         FileChannel channel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
         channel.write(buffer);
         System.out.println(Files.notExists(Paths.get("D:/f.txt")));
         //Files.deleteIfExists(Paths.get("D:/g.txt"));
         System.out.println(Files.isExecutable(Paths.get("D:/f.txt")));
         DirectoryStream<Path> paths = Files.newDirectoryStream(Paths.get("D:/Music"));
         Iterator<Path> iterator = paths.iterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }
         Path move = Files.move(Paths.get("D:/x.txt"), Paths.get("D:/Example2/"), StandardCopyOption.REPLACE_EXISTING);
    }
}
