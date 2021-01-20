package optional.example;

import java.util.Optional;

public class OrElseThrow {
    public static void main(String[] args) {
         Optional<Integer> name = Optional.empty();
         System.out.println(name.orElseThrow(ArithmeticException::new));
         Optional<Integer> name2 = Optional.empty();
         System.out.println(name2.orElseThrow());
    }
}
