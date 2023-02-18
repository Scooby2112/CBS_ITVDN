package Java_4_Advanced.Lesson5.Task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Class<?> cl = Person.class;

        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[34m";
        String s2 = (char) 27 + "[39m";

        System.out.println(s + "Fields in class Person:");

        Field[] fields = cl.getDeclaredFields();
        // ВИВОДИМ НА ЕКРАН НАЗВУ І ТИП ПОЛЯ КЛАСУ PERSON
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println(s1 + "\tName: " + s2 + field.getName());
            System.out.println(s1 + "\tType: " + s2 + fieldType.getName());
            System.out.println(s1 + "\tModifier: " + s2 + getModifiers(field.getModifiers()));
        }

        System.out.println(s + "Constructors in class Person:");

        Constructor<?>[] constructors = cl.getConstructors();
        int i = 0;
        // ВИВОДИМ НА ЕКРАН ВСІ КОНСТРУКТОРИ КЛАСУ PERSON
        for (Constructor<?> constructor : constructors) {
            System.out.print(s1 + "\tConstructor " + (++i) + ": ");
            Class<?>[] typeParameters = constructor.getParameterTypes();
            for (Class<?> paramType : typeParameters) {
                System.out.print(s2 + paramType.getName() + " ");
            }
            System.out.println();
            System.out.println(s1 + "\tModifier " + i + ":" + s2 + getModifiers(constructor.getModifiers()));
        }

        System.out.println(s + "Methods in class Person:");

        Method[] methods = cl.getDeclaredMethods();
        // ВИВОДИМ НА ЕКРАН НАЗВУ ТИП ТА ТИП ПАРАМЕТРІВ МЕТОДУ
        for (Method method : methods) {
            System.out.println(s + "Name: " + s2 + method.getName());
            System.out.println(s1 + "\tReturnType: " + s2 + method.getReturnType().getName());
            Class<?>[] paramType = method.getParameterTypes();
            System.out.print(s1 + "\tParameters type: ");
            for (Class<?> typeParam : paramType) {
                System.out.print(" " + s2 + typeParam.getName());
            }
            System.out.println();
            System.out.println(s1 + "\tModifier: " + s2 + getModifiers(method.getModifiers()));
        }

        System.out.println(s + "Class name: " + s1 + cl.getSimpleName());
        System.out.println(s + "Modifiers in class Person:" + s2 + getModifiers(cl.getModifiers()));
    }
    public static String getModifiers(int mods){
        String modifier = " ";
        if (Modifier.isPublic(mods)){
            modifier += "public ";
        }
        if (Modifier.isPrivate(mods)) {
            modifier += "private ";
        }
        if (Modifier.isFinal(mods)){
            modifier += "final ";
        }
        if (Modifier.isAbstract(mods)){
            modifier += "abstract ";
        }
        if (Modifier.isStatic(mods)){
            modifier += "static ";
        }
        if (Modifier.isProtected(mods)){
            modifier += "protected ";
        }
        return modifier;
    }
}
