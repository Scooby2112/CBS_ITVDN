package main.Java_4_Advanced.Lesson6.Task2;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD,ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface CartoonCharacter {
    String name();
    String ability();
}
