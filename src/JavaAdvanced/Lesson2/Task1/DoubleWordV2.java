package JavaAdvanced.Lesson2.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DoubleWordV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + (i + 1) + " word");
            String words = reader.readLine();
            list.add(words);
        }

        System.out.println("Вивід листа без подвоєння");

        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1){
                System.out.println("[" + i + "]" + " = " + list.get(i) + ";");
            }else
                System.out.println("[" + i + "]" + " = " + list.get(i) + ".");
        }

        doubleValues(list);
        System.out.println("--------------------------------------");

        System.out.println("Вивід листа з подвоєнням");
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1){
                System.out.println("[" + i + "]" + " = " + list.get(i) + ";");
            }else
                System.out.println("[" + i + "]" + " = " + list.get(i) + ".");
        }
    }

    public static void doubleValues(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++, i++) {
            list.add(i + 1, list.get(i));
        }
    }
}
