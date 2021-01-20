package stream.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
    public static void main(String[] args) {
        Integer[] array = {2, 5, 8, 9, 45, 32, 56};
        List<Integer> list = Arrays.asList(array);
        Stream<Integer> stream = list.stream();
        Stream<Integer> stream2 = list.stream();
        List<Integer> list2 = stream.collect(Collectors.toList());
        List<Integer> list3 = stream2.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        list2.forEach((n) -> System.out.print(n + " "));
        System.out.println();
        list3.forEach((n) -> System.out.print(n + " "));
        Stream<Integer> stream3 = list.stream();
        Map<Integer, String> map = stream3.collect(Collectors.toMap((n) -> n, (v) -> "a"));
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        set.forEach((n) -> System.out.print("\n" + n.getKey() + " " + n.getValue()));
    }
}
