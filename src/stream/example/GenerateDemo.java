package stream.example;

import java.util.stream.Stream;

public class GenerateDemo {
    public static void main(String[] args) {
         Stream<Integer> stream = Stream.generate(() -> 12).limit(10);
         // 12, 12, 12, 12, ......, 12
         stream.forEach(x -> System.out.println(x));
    }
}
