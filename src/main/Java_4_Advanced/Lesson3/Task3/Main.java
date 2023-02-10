package main.Java_4_Advanced.Lesson3.Task3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Вова\\IdeaProjects\\Java_ITVDN\\Java_04_Advanced\\src\\main\\Java_4_Advanced\\Lesson3\\FolderForTask3\\FileTask3.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            while ((temp = reader.readLine()) != null){
                System.out.println(temp);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
