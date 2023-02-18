package Java_4_Advanced.Lesson5.Task3;

import java.io.Serializable;

public class Animal implements Serializable {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", family='" + family + '\'' +
                '}';
    }

}
