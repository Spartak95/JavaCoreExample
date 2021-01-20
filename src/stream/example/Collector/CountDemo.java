package stream.example.Collector;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDemo {
    public static void main(String[] args) {
        String[] array = {"Արամ", "Տիգրան", "Արսեն", "Կարեն", "Արթուր"};
        Stream<String> stream = Arrays.stream(array);
        Long value = stream.collect(Collectors.counting());
        System.out.println("value = " + value);
    }
}
