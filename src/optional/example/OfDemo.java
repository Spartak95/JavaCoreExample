package optional.example;

import java.util.Optional;

public class OfDemo {
    public static void main(String[] args) {
         Optional<String> name = Optional.of("John");
         System.out.println(name); // Optional[John]
         Optional<String> name2 = Optional.of(null);
         System.out.println(name2); // java.lang.NullPointerException
    }
}
