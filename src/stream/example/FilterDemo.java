package stream.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
         Stream<String> stream = Stream.of("A", "B", "A", "D", "E", "F");
         List<String> list = stream.filter(s -> s.equals("A")).collect(Collectors.toList());
         list.forEach(n -> System.out.print(n + " "));
    }
}
