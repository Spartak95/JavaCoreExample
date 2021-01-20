package optional.example;

import java.util.Optional;

public class EmptyDemo {
    public static void main(String[] args) {
         Optional<String> name = Optional.empty();
         System.out.println(name); // Optional.empty
    }
}
