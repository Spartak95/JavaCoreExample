package stream.example;

import java.util.ArrayList;
import java.util.stream.Stream;

public class OfNullableDemo {
    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
         list.add("BMW");
         list.add(null);
         list.add("Opel");
         list.add("KIA");

         Stream<ArrayList<String>> stream = Stream.ofNullable(list);
         stream.forEach(n -> System.out.print(n + " "));
    }
}
