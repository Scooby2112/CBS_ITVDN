package Java_4_Advanced.Lesson2.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DoubleWord {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i + 1) + " word");
            String words = reader.readLine();
            list.add(words);
        }
        System.out.println(list + "\n---------------------------------------");

        for (int i = 0; i < doubleValues(list).size(); i++) {
            System.out.println("[" + i + "]" + " = " + doubleValues(list).get(i));
        }

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list){
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            result.add(i, list.get(i) + " " + list.get(i));
        }
        return result;
    }
}
