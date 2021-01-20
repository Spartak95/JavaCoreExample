package stream.example.Collector;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningDemo {
    public static void main(String[] args) {
         String[] array = {"Արամ", "Տիգրան", "Արսեն", "Կարեն", "Արթուր"};
         Stream<String> stream = Arrays.stream(array);
         String value = stream.collect(Collectors.joining(", "));
         System.out.println(value);
    }
}
