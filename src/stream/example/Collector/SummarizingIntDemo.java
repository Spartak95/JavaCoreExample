package stream.example.Collector;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SummarizingIntDemo {
    public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
         List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
         Stream<Integer> stream = list.stream();
         Stream<Integer> stream2 = list2.stream();
         IntSummaryStatistics value = stream.collect(Collectors.summarizingInt(i -> 0 + i));
         Integer value2 = stream2.collect(Collectors.summingInt(i -> 0 + i));
         System.out.println("value = " + value.getSum());
         System.out.println("value2  = " + value2);
    }
}
