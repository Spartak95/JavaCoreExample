package buffer.example;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class ByteBufferDemo4 {
    public static void main(String[] args) {
         byte[] b = {1, 3, 5, 6, 7, 8, 0};
         System.out.println(Arrays.toString(b));
         ByteBuffer buffer = ByteBuffer.wrap(b);
         buffer.rewind();
         buffer.get();
         buffer.get();
         buffer.get();
         System.out.println(buffer);
         byte[] a = buffer.compact().array();
         System.out.println(Arrays.toString(a));
    }
}
