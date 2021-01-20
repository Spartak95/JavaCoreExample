package stream.example;

import java.util.stream.Stream;

public class ForEachOrderedDemo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).parallel();
        // զուգահեռ տվյալների հոսքի դեպքում forEach() մեթոդը չի երաշխավորում հաջորդականությունը
        stream.forEach(n -> System.out.print(n + " "));
        System.out.println();
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).parallel();
        // զուգահեռ տվյալների հոսքի դեպքում forEachOrdered() մեթոդը երաշխավորում է հաջորդականությունը
        stream2.forEachOrdered(n -> System.out.print(n + " "));
    }
}
