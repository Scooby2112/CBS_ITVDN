package Java_JDBC_Hibernate.Lesson1.Task1;

import lombok.SneakyThrows;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/testdatabase";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws IOException {
        insert();
    }


    private static void insert() throws IOException {
        File f = new File("C:\\Users\\Вова\\IdeaProjects\\Java_ITVDN\\src\\main\\java\\Java_JDBC_Hibernate\\Lesson1\\Task1\\INSERT.txt");
        BufferedReader reader = new BufferedReader(new FileReader(f));
        String insert = reader.readLine();

        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
             Statement statement = connection.createStatement()){
            statement.executeUpdate(insert);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
