package optional.example;

import java.util.Optional;

public class OrDemo {

    public static void main(String[] args) {
         Optional<String> name = Optional.empty();
         Optional<String> val = name.or(() -> Optional.of("John"));
         System.out.println(val.get());

         Optional<String> name2 = Optional.of("John");
         Optional<String> val2 = name2.or(() -> Optional.of("Aram"));
         System.out.println(val2.get());

    }

}
