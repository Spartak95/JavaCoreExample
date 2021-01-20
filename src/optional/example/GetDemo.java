package optional.example;

import java.util.Optional;

public class GetDemo {
    public static void main(String[] args) {
         Optional<String> name = Optional.of("John");
         System.out.println(name.get()); // John
    }
}
