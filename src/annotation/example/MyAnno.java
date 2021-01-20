package annotation.example;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepeatAnno.class)
public @interface MyAnno {
    String val();
    int val2();
}
