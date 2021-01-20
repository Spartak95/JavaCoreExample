package stream.example;

import java.util.Optional;
import java.util.stream.Stream;

public class IterateDemo {
    public static void main(String[] args) {
         Stream<Integer> stream = Stream.iterate(0, n -> n + 1).limit(10);
         // 0, 1, 2, 3, 4, ......., 19
         stream.forEach(x -> System.out.print(x + " "));
         System.out.println();

         Stream<Integer> stream2 = Stream.iterate(0, n -> n < 20, n -> n + 2);
         stream2.forEach(x -> System.out.print(x + " "));
         System.out.println();

         Stream<Integer> stream3 = Stream.of(1, 5, 6, 8, 9);
         Optional<Integer> sum = stream3.reduce((a, b) -> a + b);
         System.out.println(sum.get());

         Stream<Integer> stream4 = Stream.of(1, 5, 6, 8, 9);
         Integer sum2 = stream4.reduce(1, (a, b) -> a + b);
         System.out.println(sum2);

         Stream<Integer> stream5 = Stream.of(1, 5, 6, 8, 9).parallel();
         Integer sum3 = stream5.reduce(1, (a, b) -> a + b, (a, b) -> a + b);
         System.out.println(sum3);
    }
}
