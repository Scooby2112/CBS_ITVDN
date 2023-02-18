package Java_4_Advanced.Lesson6.Task3;

import java.lang.reflect.Method;

public class Addition {
    @Math(firstNum = 10, secondNum = 20)
    public static void sum(int firstNum, int secondNum){
        int result = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + result);
    }

    public static void main(String[] args) {
        Class<?> cl = Addition.class;

        try {
            Method m = cl.getDeclaredMethod("sum", int.class, int.class);
            Math math = m.getAnnotation(Math.class);
            sum(math.firstNum(), math.secondNum());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
