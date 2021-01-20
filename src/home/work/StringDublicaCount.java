package home.work;

import java.util.*;

public class StringDublicaCount {
    public static void dublicatCount(String input) {
        char[] c = input.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character key : c) {
            if (map.containsKey(key)){
                map.put(key, (map.get(key) + 1));
            } else {
                map.put(key, 1);
            }
        }

        System.out.println(input);

        Set<Character> set = map.keySet();

        for (Character c2 : set){
            if (map.get(c2) > 1){
                System.out.println(c2 + " - " + map.get(c2));
            } else {
                System.out.println(c2 + " - " + map.get(c2));
            }
        }
    }

    public static void main(String[] args) {
          dublicatCount("ddorss");
    }
}
