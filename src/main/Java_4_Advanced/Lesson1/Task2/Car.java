package main.Java_4_Advanced.Lesson1.Task2;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    public int compareTo(Object o) {
        int temp = this.speed - ((Car)o).speed;
        if (temp == 0) {
            temp = this.price - ((Car) o).price;
            if (temp == 0) {
                temp = this.model.compareTo(((Car) o).model);
                if (temp == 0) {
                    return this.color.compareTo(((Car) o).color);
                }
            }
        }
        return temp;
    }
}
