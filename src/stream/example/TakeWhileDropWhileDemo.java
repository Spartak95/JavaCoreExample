package stream.example;

import java.util.stream.Stream;

public class TakeWhileDropWhileDemo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(11, 12, 25, 12, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // dropWhile() մեթոդը վերջնական օպերացիա է
        stream.dropWhile(n -> n > 5).forEach(n -> System.out.print(n + " "));
        System.out.println();
        // takeWhile() մեթոդը վերջնական օպերացիա է
        stream2.takeWhile(n -> n < 5).forEach(n -> System.out.print(n + " "));
    }
}
