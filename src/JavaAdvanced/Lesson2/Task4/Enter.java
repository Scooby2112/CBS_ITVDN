package JavaAdvanced.Lesson2.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Enter {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        listString();
    }

    public static void listString() throws IOException {
        LinkedList<String> list = new LinkedList<>();
        int index = 0;

        while (true) {
            System.out.println("Enter " + (index + 1) + " row. If you want to stop, enter (end)");
            String row = reader.readLine();
            if (row.equals("end") || row.equals("End")) {
                System.out.println("You have stopped adding rows");
                break;
            } else {
                list.add(row);
            }
        }
        for (String temp : list) {
            System.out.println("[" + index + "]" + " = " + temp);
            index++;
        }
    }
}
