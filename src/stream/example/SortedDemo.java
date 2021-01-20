package stream.example;

import java.util.stream.Stream;

public class SortedDemo {
    public static void main(String[] args) {
         Stream<Integer> stream = Stream.of(2, 56, 9, 1, 5, 32, 23);
         stream.sorted(Integer::compareTo).forEach(n -> System.out.print(n + " "));
    }
}
