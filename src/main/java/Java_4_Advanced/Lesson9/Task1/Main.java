package Java_4_Advanced.Lesson9.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 60));
        }
        System.out.println("Список: " + list);

        int result = list
                .stream()
                .map(e -> e * e)
                .reduce(0, Integer::sum);

        System.out.println("Сума квадратів усіх елементів списку: " + result);
    }
}
