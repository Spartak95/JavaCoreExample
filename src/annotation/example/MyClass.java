package annotation.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyClass {
    @MyAnno(val = "Spartak", val2 = 25)
    @MyAnno(val = "Gareginyan", val2 = 25)
    public static void method() throws NoSuchMethodException {
         Class<?> c = MyClass.class;
         Method m = c.getMethod("method");

         System.out.println("--getAnnotationsByType(MyAnno.class)--");
         Annotation[] anno = m.getAnnotationsByType(MyAnno.class);
         for (int i = 0; i < anno.length; i++) {
             System.out.println(anno[i]);
         }

         System.out.println("--getAnnotationsByType(RepeatAnno.class)--");
         Annotation[] anno2 = m.getAnnotationsByType(RepeatAnno.class);
         for (int i = 0; i < anno2.length; i++) {
            System.out.println(anno2[i]);
         }

         System.out.println("--getAnnotations()--");
         Annotation[] anno3 = m.getAnnotations();
         for (int i = 0; i < anno3.length; i++) {
             System.out.println(anno3[i]);
         }


         System.out.println("--getAnnotation(MyAnno.class)--");
         Annotation anno4 = m.getAnnotation(MyAnno.class); // null
         System.out.println("anno4 " + anno4);

         System.out.println("--getAnnotation(RepeatAnno.class)--");
         Annotation anno5 = m.getAnnotation(RepeatAnno.class);
         System.out.println("anno5 " + anno5);
    }

    public static void main(String[] args) throws NoSuchMethodException {
         method();
    }
}

