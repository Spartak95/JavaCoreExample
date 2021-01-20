package stream.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekDemo {
    public static void main(String[] args) {
         Stream<Integer> stream = Stream.of(2, 5, 9, 9, 5, 32, 56);
         List<Integer> list = stream.peek(n -> System.out.print(n + " ")).collect(Collectors.toList());
         System.out.println();

         Stream<String> stream2 = Stream.of("bus", "car", "bycle", "flight", "train");
         // կատարվում է սկսզբից միայն միջանկյալ օպերացիաները
         List<String> list2 = stream2.filter(e -> e.length() > 3)
                                     .peek(e -> System.out.println("Ֆիլտրացված արժեքը: " + e))
                                     .map(String::toUpperCase)
                                     .peek(e -> System.out.println("Պատկերման արժեքը: " + e))
                                     .collect(Collectors.toList());

         Stream<User> stream3 = Stream.of(new User("Alice"), new User("Bob"), new User("Chuck"));
         stream3.peek(a -> a.setName(a.getName().toUpperCase())).forEach(n -> System.out.print(n + " "));
    }
}
