package Java_4_Advanced.Lesson3.Task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File f1 = new File("C:\\Users\\Вова\\IdeaProjects\\Java_ITVDN\\Java_04_Advanced\\src\\main\\Java_4_Advanced\\Lesson3\\Task1\\File.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new FileWriter(f1, true));

        System.out.println("Введіть кількість рядків");
        int num = Integer.parseInt(br.readLine());

        String str;
        for (int i = 0; i < num; i++) {
            System.out.println("Введіть рядок");
            str = br.readLine();
            pw.write(str);
            pw.println();
        }
        br.close();
        pw.flush();

        BufferedReader reader = new BufferedReader(new FileReader(f1));

        String temp;
        while ((temp = reader.readLine()) != null) {
            System.out.println(temp);
        }
        reader.close();
        pw.close();
    }
}