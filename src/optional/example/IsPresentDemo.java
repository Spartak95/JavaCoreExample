package optional.example;

import java.util.Optional;

public class IsPresentDemo {
    public static void main(String[] args) {
         Optional<String> name = Optional.of("John");
         Optional<String> name2 = Optional.ofNullable(null);
         Optional<String> name3 = Optional.empty();

         // միայն այս պայմանական կոնստրուկցիան կկատարվի
         if (name.isPresent()){
             System.out.println(name.get());
         }

         if (name2.isPresent()){
             System.out.println(name2.get());
         }

         if (name3.isPresent()){
             System.out.println(name3.get());
         }
    }
}
