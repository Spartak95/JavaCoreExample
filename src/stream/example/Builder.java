package stream.example;

import java.util.stream.Stream;

public class Builder {
    public static void main(String[] args) {
         Stream stream = Stream.builder().add(1).add(5).add(4).add(9).build();
         stream.forEach(n -> System.out.print(n + " "));
    }
}
