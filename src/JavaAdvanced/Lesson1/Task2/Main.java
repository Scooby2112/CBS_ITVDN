package JavaAdvanced.Lesson1.Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 2000, "BMW", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Black");
        Car c3 = new Car(190, 2000, "Mercedes", "White");
        Car[] c = {c1, c2, c3};

        Arrays.sort(c);   // ClassCastException
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
