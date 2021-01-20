package stream.example;

import java.util.stream.Stream;

public class MatchDemo {
    public static void main(String[] args) {
         Stream<Integer> stream = Stream.of(2, 5, 8, 9, 45, 32, 56);
         Stream<Integer> stream2 = Stream.of(2, 5, 8, 9, 45, 32, 56);
         Stream<Integer> stream3 = Stream.of(2, 5, 8, 9, 45, 32, 56);
         boolean allMatch = stream.allMatch((a) -> a instanceof Integer);
         boolean anyMatch = stream2.anyMatch((a) -> a % 2 == 0);
         boolean noneMatch = stream3.noneMatch((a) -> a > 100);
         System.out.println(allMatch); // true
         System.out.println(anyMatch); // true
         System.out.println(noneMatch); // true
    }
}
