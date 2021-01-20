package stream.example;

import java.util.stream.Stream;

public class SkipDemo {
    public static void main(String[] args) {
        // skip() մեթոդը միջանկյալ օպերացիա է
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).skip(3);
        stream.forEach(n -> System.out.print(n + " "));
    }
}
