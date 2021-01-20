package stream.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class ToArrayDemo {
    public static void main(String[] args) {
         Stream<Integer> stream = Stream.of(2, 5, 9, 9, 5, 32, 56);
         Stream<Integer> stream2 = Stream.of(12, 52, 94, 91, 5, 82, 46);
         // toArray() մեթոդը վերջնական օպերացիա է
         Object[] array = stream.toArray();
         Integer[] array2 = stream2.toArray(Integer[]::new);
         System.out.println(Arrays.toString(array));
         System.out.println(Arrays.toString(array2));
    }
}
