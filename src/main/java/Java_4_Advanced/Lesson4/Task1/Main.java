package Java_4_Advanced.Lesson4.Task1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\Вова\\IdeaProjects\\Java_ITVDN\\Java_04_Advanced\\src\\main\\Java_4_Advanced\\Lesson4\\Task1\\File.txt");
        BufferedReader reader = new BufferedReader(new FileReader(f1));

        Pattern p = Pattern.compile("\\b(в|з|у)\\b", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher m = p.matcher(reader.readLine());

        String text = m.replaceAll("Java");

        System.out.println(text);
    }
}
