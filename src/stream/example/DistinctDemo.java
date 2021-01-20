package stream.example;

import java.util.stream.Stream;

public class DistinctDemo {
    public static void main(String[] args) {
         Stream<Integer> stream = Stream.of(2, 5, 9, 9, 5, 32, 56);
         // distinct() մեթոդը միջանկյալ օպերացիա է
         Stream<Integer> stream2 = stream.distinct();
         stream2.forEach((n) -> System.out.print(n + " "));
    }
}
