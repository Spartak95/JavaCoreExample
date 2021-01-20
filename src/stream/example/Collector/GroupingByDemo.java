package stream.example.Collector;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByDemo {
    public static void main(String[] args) {
         Stream<String> stream = Stream.of("ab", "c", "def", "gh", "ijk", "l", "mnop");
         Map<Integer, List<String>> map = stream.collect(Collectors.groupingBy(String::length));
         for (Map.Entry<Integer, List<String>> a : map.entrySet()){
             System.out.println(a.getKey() + " " + a.getValue());
         }
    }
}
