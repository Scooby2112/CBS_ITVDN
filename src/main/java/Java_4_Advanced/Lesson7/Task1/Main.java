package Java_4_Advanced.Lesson7.Task1;

import Java_4_Advanced.Lesson5.Task3.Animal;

import java.io.*;

/**
 * @author Volodymyr Plemennyk
 */

public class Main {
    public static void main(String[] args) {
        // СТВОРЮЄМО ФАЙЛ В ЯКИЙ БУДЕМО ЗАПИСУВАТИ БАЙТ КОД ОБ’ЄКТУ
        File f = new File("C:\\Users\\Вова\\IdeaProjects\\Java_ITVDN\\Java_04_Advanced\\src\\main\\Java_4_Advanced\\Lesson7\\Task1\\deserialization.txt");
        // СТВОРЮЄМО ОБ‘ЄК ЯКИЙ БУДЕМО СЕРЕАЛІЗУВАТИ
        Animal animal = new Animal("Ignil", 6, "Dragon");
        // ОБРОБЛЯЄМО ВСЕ ЧЕРЕЗ TRY - CATCH WITH RESOURCES
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))) {
            // СЕРІАЛІЗУЄМО ОБ’ЄКТ В БАЙТ КОД
            outputStream.writeObject(animal);
            // ДЕСЕРЕАЛІЗУЄМО ТА ВИВОДИМО НА ЕКРАН ВМІСТ ФАЙЛУ
            animal = null;
            animal = (Animal) inputStream.readObject();
            System.out.println(animal);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
