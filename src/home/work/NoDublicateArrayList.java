package home.work;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class NoDublicateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(2);

        System.out.println(list);

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (Integer i : list) {
            set.add(i);
        }

        System.out.println(set);

        list.clear();

        for (Integer a : set){
            list.add(a);
        }

        System.out.println(list);
    }

}
