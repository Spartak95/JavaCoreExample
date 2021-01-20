package stream.example;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstFindAnyDemo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(23, 5, 9, 9, 5, 32, 56);
        // findFirst() մեթոդը միշտ վերադարձնում է
        // հաջորդական տվյալների հոսքի առաջին էլեմենտին
        Optional<Integer> optional = stream.findFirst();
        if (optional.isPresent()){
            System.out.println("stream - " + optional.get());
        }
        // findAny() մեթոդը վերադարձնում է
        // զուգահեռ տվյալների հոսքի պատահական էլեմենտին
        Stream<Integer> stream2 = Stream.of(23, 5, 9, 9, 5, 32, 56).parallel();
        Optional<Integer> optional2 = stream2.findAny();
        if (optional2.isPresent()){
            System.out.println("stream2 - " + optional2.get());
        }
        // findAny() մեթոդը միշտ վերադարձնում է
        // հաջորդական տվյալների հոսքի առաջին էլեմենտին
        Stream<Integer> stream3 = Stream.of(23, 5, 9, 9, 5, 32, 56);
        Optional<Integer> optional3 = stream3.findAny();
        if (optional3.isPresent()){
            System.out.println("stream3 - " + optional3.get());
        }
        // findFirst() մեթոդը միշտ վերադարձնում է
        // զուգահեռ տվյալների հոսքի առաջին էլեմենտին
        Stream<Integer> stream4 = Stream.of(23, 5, 9, 9, 5, 32, 56).parallel();
        Optional<Integer> optional4 = stream4.findFirst();
        if (optional4.isPresent()){
            System.out.println("stream4 - " + optional4.get());
        }
    }
}
