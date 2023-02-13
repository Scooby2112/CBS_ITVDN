package main.Java_4_Advanced.Lesson5.Task3;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[34m";
        String s2 = (char) 27 + "[39m";

        Class<?> cl = Animal.class;
        // СТВОРЮЄМО ОБ’ЄКТ КЛАСУ ANIMAL
        Animal animal = new Animal();
        // СТВОРЮЄМО ФІЛДИ, ТА В ПАРАМЕТРАХ ВКАЗУЄМО НАЗВУ ПОЛЯ
        Field name = cl.getDeclaredField("name");
        Field age = cl.getDeclaredField("age");
        Field family = cl.getDeclaredField("family");
        // В ПАРАМЕТРАХ "SET.ACCESSIBLE" СТАВИМО "TRUE" ЯКШО У НАС МОДИФІКАТОР ДОСТУПУ PRIVATE
        name.setAccessible(true);
        age.setAccessible(true);
        family.setAccessible(true);
        // ПЕРЕВІРЯЄМО МЕТОДОМ "GET" ЯКІ ЗНАЧЕННЯ ЗАРАЗ МАЮТЬ ПОЛЯ КЛАСУ ANIMAL
        System.out.println(s1 + name.getName() + ": "+ s2 + name.get(animal));
        System.out.println(s1 + age.getName() + ": "+ s2 + age.get(animal));
        System.out.println(s1 + family.getName() + ": "+ s2 + family.get(animal));
        // РОЗДІЛИМО МІЖ ДО ТА ПІСЛЯ
        System.out.println();
        // НАДАЄМО ЇМ ЗНАЧЕННЯ В КЛАСІ "CAT"
        name.set(animal, "Alex");
        age.setInt(animal, 16);
        family.set(animal, "Cat");
        // ВИВОДИМО ЗНАЧЕННЯ НА ЕКРАН
        System.out.println(s1 + name.getName() + ": " + s2 + name.get(animal));
        System.out.println(s1 + age.getName() + ": " + s2 + age.get(animal));
        System.out.println(s1 + family.getName() + ": " + s2 + family.get(animal));
    }
}
