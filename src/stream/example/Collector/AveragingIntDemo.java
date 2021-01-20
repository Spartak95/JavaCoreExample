package stream.example.Collector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AveragingIntDemo {
    public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1, 2, 3, 4);
         Stream<Integer> stream = list.stream();
         // averaging() մեթոդի օգնությամբ ստանում ենք թվաբանական միջ
         Double value = stream.collect(Collectors.averagingInt(v -> v * 2));
         System.out.println("value = " + value);
    }
}
