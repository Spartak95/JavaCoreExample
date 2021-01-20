package stream.example;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {
    public static void main(String[] args) {
         IntStream stream = IntStream.rangeClosed(0, 5);
         // 0, 1, 2, 3, 4, 5
         stream.forEach(x -> System.out.print(x + " "));
         System.out.println();

         IntStream stream2 = IntStream.range(0, 5);
         // 0, 1, 2, 3, 4
         stream2.forEach(x -> System.out.print(x + " "));
         System.out.println();

         IntStream stream3 = IntStream.range(0, 5);
         Stream<Integer> stream4 = stream3.boxed(); // նման է Stream.of(0, 1, 2, 3, 4);
         stream4.forEach(x -> System.out.print(x + " "));
         System.out.println();

         IntStream stream5 = IntStream.range(0, 5);
         Stream<Car> stream6 = stream5.mapToObj(x -> new Car("Aram", x));
         stream6.forEach(x -> System.out.println(x));
         System.out.println();

         IntSummaryStatistics stats = IntStream.range(2, 16)
                 .summaryStatistics();
         System.out.format("count: %d%n", stats.getCount());
         System.out.format("sum: %d%n", stats.getSum());
         System.out.format("average: %.1f%n", stats.getAverage());
         System.out.format("min: %d%n", stats.getMin());
         System.out.format("max: %d%n", stats.getMax());
    }
}
