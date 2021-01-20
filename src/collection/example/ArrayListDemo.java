package collection.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayListDemo {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.add(2);
         list.add(12);
         list.add(31);
         list.add(56);
         list.add(1);
         list.add(105);

         Integer[] arr = new Integer[12];

         Integer[] arrlist = list.toArray(arr);

         System.out.println(Arrays.toString(arrlist));

         Stream<Integer> stream = list.stream();

         Stream<String> stream2 = stream.sorted(Integer::compareTo).map(n -> String.valueOf(n));

         stream2.forEach(n -> System.out.print(n + " "));
    }
}
