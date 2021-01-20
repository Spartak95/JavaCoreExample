package stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class MapDemo {
    public static void main(String[] args) {

         int a = 10;
         Stream<Integer> stream = Stream.of(23, 5, 9, 9, 5, 32, 56);
         IntStream intStream = IntStream.of(a, a, 9, 9, 5, 32, 56);
         LongStream longStream = LongStream.of(23, 5, 9, 9, 5, 32, 56);
         DoubleStream doubleStream = DoubleStream.of(23, 5, 9, 9, 5, 32, 56);
         Stream<String> stream2 = Stream.of("Արամ", "Տիգրան", "Արսեն", "Արմեն", "Սարգիս");
         Stream<String> stream3 = Stream.of("Արամ", "Տիգրան", "Արսեն", "Արմեն", "Սարգիս");
         Stream<String> stream4 = Stream.of("Արամ,Տիգրան", "Արսեն,Արմեն", "Սարգիս");
         Stream<Integer> stream5 = Stream.of(23, 5, 9, 9, 5, 32, 56);

         Stream<Integer> s = stream.map(n -> n + 4);
         s.forEach(n -> System.out.print(n + " "));
         System.out.println();

         IntStream s2 = intStream.map(n -> n + 3);
         s2.forEach(n -> System.out.print(n + " "));
         System.out.println();

         LongStream s3 = longStream.map(n -> n + 2);
         s3.forEach(n -> System.out.print(n + " "));
         System.out.println();

         DoubleStream s4 = doubleStream.map(n -> n + 1);
         s4.forEach(n -> System.out.print(n + " "));
         System.out.println();

         Stream<String> s5 = stream2.map(n -> n.toUpperCase());
         s5.forEach(n -> System.out.print(n + " "));
         System.out.println();

         List<String> s6 = stream3.filter(n -> String.valueOf(n.charAt(0)).equals("Ա"))
                                  .collect(Collectors.toList());
         s6.forEach(n -> System.out.print(n + " "));
         System.out.println();

         stream4.map(n -> n.split(",")).flatMap(Arrays::stream).forEach(n -> System.out.print(n + " "));
         System.out.println();

         Stream<String> s7 = stream5.map(n -> String.valueOf(n).concat("a"));
         s7.forEach(n -> System.out.print(n + " "));
         System.out.println();

         // ---------------------------------------------------------------------

         Stream<Integer> stream6 = Stream.of(23, 5, 9, 9, 5, 32, 56);

         Stream<String> s8 = stream6.map(c -> String.valueOf(c));
         s8.forEach(n -> System.out.print(n + " "));

    }
}
