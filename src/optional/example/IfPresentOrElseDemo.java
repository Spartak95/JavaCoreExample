package optional.example;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class IfPresentOrElseDemo {
     private static Map<String, String> surviors = Map.of("John", "Snow",
             "Aria", "Stark",
             "Tyrion", "Lannister",
             "Daenerys", "Targaryen");

     private static Optional<String> getSurname(String name) {
         return Optional.ofNullable(surviors.get(name));
     }

     private static void printAlive(String surname) {
         System.out.println(surname + " կենդանի է");
     }

     private static void printDead() {
         System.out.println("մահացած են");
     }

     public static void main(String[] args) {
         List<String> names = List.of("John", "Aria", "Tyrion", "Daenerys", "Eddard");
         names.stream().map(IfPresentOrElseDemo::getSurname).
                 forEach(x -> x.ifPresentOrElse(IfPresentOrElseDemo::printAlive, IfPresentOrElseDemo::printDead));
     }
}
