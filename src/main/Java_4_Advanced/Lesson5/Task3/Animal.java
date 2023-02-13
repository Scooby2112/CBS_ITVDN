package main.Java_4_Advanced.Lesson5.Task3;

public class Animal {
    private String name;
    private int age;
    private String family;

    public Animal (){}

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age, String family) {
        this.name = name;
        this.age = age;
        this.family = family;
    }
}
