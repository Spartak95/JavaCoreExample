package optional.example;

import java.util.Optional;

public class OfNullableDemo {
    public static void main(String[] args) {
        String str = null;
        Optional<String> name = Optional.ofNullable(str);
        System.out.println(name); // Optional.empty
    }
}
