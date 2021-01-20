package reflect.example;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListCapacityDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            System.out.println(capacity(list));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        list.add(11);
        list.add(10);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(13);
        try {
            System.out.println(capacity(list));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static int capacity(ArrayList list) throws IllegalAccessException {
        Field field = null;
        try {
            field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return ((Object[]) field.get(list)).length;
    }
}
