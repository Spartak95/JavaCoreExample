package buffer.example;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ByteBufferDemo3 {
    public static void main(String[] args) {
         Path path = Paths.get("D:/file.txt");
         ByteBuffer buffer = ByteBuffer.allocate(11);

         try {
              FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);
              System.out.println("buffer " + buffer);
              channel.read(buffer);
              buffer.flip();
              System.out.println("-----------------------");
              System.out.println("buffer | " + buffer); // 0

              System.out.print((char) buffer.get() + " - ");
              System.out.println("buffer | " + buffer); // 1

              System.out.print((char) buffer.get() + " - ");
              System.out.println("buffer | " + buffer); // 2

              System.out.print((char) buffer.get() + " - ");
              System.out.println("buffer | " + buffer); // 3

              System.out.print((char) buffer.get() + " - ");
              System.out.println("buffer | " + buffer); // 4

//              buffer.get();
//              System.out.println("buffer " + buffer); // 5

              System.out.println("-----------------------");
              System.out.println("buffer | " + buffer);
              ByteBuffer compact = buffer.compact();
              System.out.println(compact);
              compact.rewind();
              while (compact.hasRemaining()){
                   System.out.print((char) compact.get());
              }
              System.out.println();
              byte[] array = compact.array();
              System.out.println(new String(array));
         } catch (IOException e) {
              e.printStackTrace();
         }
    }
}
