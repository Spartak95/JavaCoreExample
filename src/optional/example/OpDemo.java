package optional.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OpDemo {
    public static void main(String[] args) {
         Optional<Integer> optional = Optional.of(12);

         String[][] str = {{"1", "2", "3"},
                           {"4", "5", "6"},
                           {"7", "8", "9"}};

         Stream<String[]> stream = Stream.of(str);

         Stream<Integer> stream2 = stream.flatMap(n -> Arrays.stream(n)).map(v -> Integer.valueOf(v));
         stream2.forEach(n -> System.out.print(n + " "));

         List<Integer> list = Arrays.asList(2, 3, 5, 8, 9, 45);
         Stream<Integer> stream3 = list.parallelStream();
         Optional<Integer> any = stream3.findAny();
         System.out.println("\n" + any.get());

         Stream<Integer> stream4 = list.stream();
         Optional<Integer> any2 = stream4.findAny();
         System.out.println(any2.get());
    }
}
