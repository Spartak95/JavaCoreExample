package stream.example;

import java.util.stream.Stream;

public class LimitDemo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream2 = stream.limit(5);
        stream2.forEach((n) -> System.out.print(n + " "));
    }
}
