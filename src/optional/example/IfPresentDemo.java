package optional.example;

import java.util.Optional;

public class IfPresentDemo {
    public static void main(String[] args) {
         // եթե Optional կլասսը դատարկ է, ապա
         // ifPresent() մեթոդը չի կատարվում
         Optional<String> name = Optional.empty();
         name.ifPresent((n) -> System.out.println(n));

         // եթե Optional կլասսը դատարկ չէ, ապա
         // ifPresent() մեթոդը կատարվում է
         Optional<String> name2 = Optional.of("John");
         name2.ifPresent((n) -> System.out.println(n));

    }
}
