package stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorDemo {
    public static void main(String[] args) {
        Integer[] array = {2, 5, 8, 9, 45, 32};
        System.out.println(Arrays.toString(array));
        List<Integer> list = Arrays.asList(array);
        Stream<Integer> stream = list.parallelStream();
        Spliterator<Integer> spliterator = stream.spliterator();
        Spliterator<Integer> trySplit = spliterator.trySplit();
        Spliterator<Integer> trySplit2 = spliterator.trySplit();
        System.out.println("trySplit");
        trySplit.forEachRemaining((n) -> System.out.print(n + " "));
        System.out.println("\ntrySplit2");
        trySplit2.forEachRemaining((n) -> System.out.print(n + " "));
        System.out.println("\nspliterator");
        spliterator.forEachRemaining((n) -> System.out.print(n + " "));
    }
}
