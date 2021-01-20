package reflect.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.lang.String");
            System.out.println("--String կլասսի փոփոխականները--");
            Field[] field = c.getFields();
            for (Field f : field) {
                System.out.println(f);
            }
            System.out.println("--String կլասսի մեթոդները--");
            Method[] method = c.getMethods();
            for (Method m : method) {
                System.out.println(m);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
