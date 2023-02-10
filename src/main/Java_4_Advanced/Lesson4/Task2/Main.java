package main.Java_4_Advanced.Lesson4.Task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String formatDate = "dd.MM.yyyy";
        String formatTime = "HH:mm:ss";

        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern(formatDate);
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern(formatTime);

        System.out.println("Введіть дату народження у форматі " + "(" + formatDate + ")");
        LocalDate localDate = LocalDate.parse(sc.nextLine(), formatterDate);

        System.out.println("Введіть час народження у форматі " + "(" + formatTime + ")");
        LocalTime localTime = LocalTime.parse(sc.nextLine(), formatterTime);

        age(localDate, localTime);
    }

    public static void age (LocalDate date, LocalTime time){
        LocalDate localDateNow = LocalDate.now();
        Period period = Period.between(date, localDateNow);

        LocalTime localTimeNow = LocalTime.now();
        LocalTime localTimeAge = localTimeNow
                .minusHours(time.getHour())
                .minusMinutes(time.getMinute())
                .minusSeconds(time.getSecond());

        System.out.println("Вам виповнилося " + period.getYears() + " років\n"
                + period.getMonths() + " місяців\n"
                + period.getDays() + " днів\n"
                + localTimeAge.getHour() + " годин\n"
                + localTimeAge.getMinute() + " хвилин\n"
                + localTimeAge.getSecond() + " секунд");
    }
}
