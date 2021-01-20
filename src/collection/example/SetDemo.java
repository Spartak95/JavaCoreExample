package collection.example;

import java.util.Arrays;
import java.util.List;

public class SetDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 2, 5);
        InstrumentSet<Integer> set = new InstrumentSet<>();
        set.addAll(list);
        System.out.println(set.getCount());
    }
}
