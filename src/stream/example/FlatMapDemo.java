package stream.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
     public static void main(String[] args) {
          String[][] str = {{"a", "b", "c"},
                  {"d", "e", "f"},
                  {"g", "h", "i"}};

          String[][] str2 = {{"a", "b", "c"},
                  {"d", "e", "f"},
                  {"g", "h", "i"}};

          Stream<String[]> stream = Arrays.stream(str);
          Stream<String[]> stream2 = Arrays.stream(str);

          stream.flatMap(Stream::of).map(x -> x.toUpperCase()).forEach(n -> System.out.print(n + " "));
          //stream2.map(x -> Stream.of(x)).forEach(n -> System.out.print(n + " "));
          System.out.println();

          // ---------------------------------------------------

          List<Car> list = Arrays.asList(new Car("BMW", 1995),
                  new Car("Opel", 1998),
                  new Car("KIA", 2001),
                  new Car("Ford", 1995));

          ArrayList<String> list2 = new ArrayList<>();
          for (Car a : list) {
               list2.add(a.getName());
          }

          System.out.println(list2);

          Stream<String> stream5 = list.stream().flatMap(a -> Stream.of(a.getName()));
          stream5.forEach(n -> System.out.print(n + " "));
          System.out.println();

          // ----------------------------------------------------------------

          List<String> list3 = Arrays.asList("Geeks", "GFG",
                  "GeeksforGeeks", "gfg");

          Stream stream3 = list3.stream().flatMap(s -> Stream.of(s.charAt(2)));
          stream3.forEach(System.out::println);

          List<String> list4 = Arrays.asList("Geeks", "GFG",
                  "GeeksforGeeks", "gfg");
          list4.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);
          System.out.println();

          //--------------------------------------------------------------------

          String[][] array = {{"J","a","v","a"},
                              {"R","u","s","h"}};
          Stream<String[]> streamOfArray = Arrays.stream(array);
          Stream<String> df = streamOfArray.flatMap(Stream::of).distinct();
          df.forEach(x -> System.out.print(x + " "));
     }
}