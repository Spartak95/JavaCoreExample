package optional.example;

import java.util.Optional;

public class OrElseGetDemo {
    public static void main(String[] args) {
         Optional<String> name = Optional.empty();
         String cv = name.orElseGet(OrElseGetDemo::val);
         System.out.println(cv);
    }

    private static String val(){
        return "John";
    }
}
