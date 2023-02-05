package JavaAdvanced.Lesson1.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(61267);
        list.add(43454);
        list.add(81323);
        list.add(12345);
        list.add(87234);

        Collections.sort(list);

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            Integer integer = listIterator.next();
            System.out.println(integer);
        }

        System.out.println("-------------------------------------");

        while (listIterator.hasPrevious()){
            Integer integer = listIterator.previous();
            System.out.println(integer);
        }
    }
}

