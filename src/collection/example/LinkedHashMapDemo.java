package collection.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        int a = 5;
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > a;
            }
        };

        map.put(120, "sd");
        map.put(121, "sd2");
        map.put(122, "sd3");
        map.put(123, "sd4");
        map.put(124, "sd5");
        System.out.println(map);
        map.put(125, "sd6");
        System.out.println(map);

        for (Map.Entry<Integer, String> x : map.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
