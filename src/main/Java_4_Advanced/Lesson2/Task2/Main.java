package main.Java_4_Advanced.Lesson2.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> list = getIntegerList();
        System.out.println("Minimum value = " + getMinimum(list));
    }

    public static LinkedList<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter number of numbers");
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + "[" + (i + 1) + "]" + " number");
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }

    public static int getMinimum(LinkedList<Integer> list){
        int minimum = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (minimum > list.get(i)){
                minimum = list.get(i);
            }
        }
        return minimum;
    }
}
