package optional.example;

import java.util.Optional;

public class OrElseDemo {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("John");
        System.out.println(name.orElse("Aram"));

        // եթե Optional կլասսը դատարկ է, ապա
        // կկատարվի orElse() մեթոդի պարունակությունը
        Optional<String> name2 = Optional.empty();
        System.out.println(name2.orElse("Aram"));
    }
}
