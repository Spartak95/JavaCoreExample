package stream.example;

import java.util.stream.Stream;

public class ConcatDemo {
    public static void main(String[] args) {
         Stream<Integer> stream = Stream.of(2, 5, 8);
         Stream<Integer> stream2 = Stream.of(9, 45, 32, 56);
         Stream<Integer> stream3 = Stream.concat(stream, stream2);
         stream3.forEach((n) -> System.out.print(n + " "));
    }
}
