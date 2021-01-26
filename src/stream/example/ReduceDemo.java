package stream.example;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
         Stream<Integer> stream = Stream.of(2, 5, 9, 32, 56);
         Stream<Integer> stream2 = Stream.of(2, 5, 9, 32, 56);
         Stream<Integer> stream3 = Stream.of(2, 5, 9, 32, 56).parallel();
         Stream<Integer> stream4= Stream.of(2, 5, 9, 32, 56);
         Optional<Integer> optional = stream.reduce(Integer::sum);
         int value = stream2.reduce(1, Integer::sum);
         int value2 = stream3.reduce(1, (acc, com) -> acc * com, Integer::sum);
         int value3 = stream4.reduce(0, (a, b) -> b % 2 == 0 ? a + b : a);
         optional.ifPresent(integer -> System.out.println("optional " + integer));
         System.out.println("value " + value);
         System.out.println("value2 " + value2);
         System.out.println("Զույգ թվերի գումարը " + value3);
    }
}
