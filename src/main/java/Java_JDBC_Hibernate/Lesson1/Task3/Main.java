package Java_JDBC_Hibernate.Lesson1.Task3;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Requests requests = new Requests();
        requests.registerDriver();

//                                       ДЛЯ ЗАПОВНЕННЯ ТАБЛИЦІ:
//                                                 |
//                                                 V
//        requests.insertInto();

//                                  ДЛЯ ВИДАЛЕННЯ ДАНИХ З ТАБЛИЦІ:
//                                                 |
//                                                 V
//        requests.delete();

//                                  ДЛЯ ОНОВЛЕННЯ ДАНИХ В ТАБЛИЦІ
//                                                 |
//                                                 V
//        requests.update();
    }
}
