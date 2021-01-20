package stream.example;

import java.util.*;
import java.util.stream.Stream;

public class MinMaxDemo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2, 5, 9, 9, 5, 32, 56);
        // max() մեթոդը վերջնական օպերացիա է
        System.out.println(stream.max(Integer::compareTo));
        Stream<Integer> stream2 = Stream.of(2, 5, 9, 9, 5, 32, 56);
        // min() մեթոդը վերջնական օպերացիա է
        System.out.println(stream2.min(Integer::compare));
    }
}
