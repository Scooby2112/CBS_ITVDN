package Java_JDBC_Hibernate.Lesson1.Task3;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Requests requests = new Requests();

//        requests.insertInto();

        requests.update();

        requests.delete();
    }
}
