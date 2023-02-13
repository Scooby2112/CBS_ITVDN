package main.Java_4_Advanced.Lesson5.Task2;

public final class Person {
    public String name;
    protected int age;
    private int cash;

    public Person() {}

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age, int cash) {
        this.name = name;
        this.age = age;
        this.cash = cash;
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

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
