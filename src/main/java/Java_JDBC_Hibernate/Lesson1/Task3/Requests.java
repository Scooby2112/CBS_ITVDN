package Java_JDBC_Hibernate.Lesson1.Task3;

import Java_JDBC_Hibernate.Connection.Connect;

import java.io.*;
import java.sql.*;

public class Requests {
    private final Connect connect = new Connect(
            "./src/main/java/Java_JDBC_Hibernate/Connection/connect.properties",
            "com.mysql.jdbc.Driver"
    ).loadProperties().loadDriver();

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private File fileRequest;
    private BufferedReader fileReader;

    public void insertInto() throws IOException {
        fileRequest = new File("./src/main/java/java_JDBC_Hibernate/Lesson1/Task3/Requests/Insert.txt");
        fileReader = new BufferedReader(new FileReader(fileRequest));
        String insert = fileReader.readLine();

        String lastName;
        String firstName;
        String surname;
        int age;
        String phone;
        Date date;
        String location;

        try (Connection connection = DriverManager.getConnection(connect.url(), connect.login(), connect.password());
             PreparedStatement statement = connection.prepareStatement(insert)) {

            for (int i = 0; i < 1; i++) {
                System.out.println("Введіть прізвище:");
                statement.setString(1, lastName = reader.readLine());

                System.out.println("Введіть ім’я:");
                statement.setString(2, firstName = reader.readLine());

                System.out.println("Введіть по-батькові:");
                statement.setString(3, surname = reader.readLine());

                System.out.println("Введіть вік:");
                statement.setInt(4, age = Integer.parseInt(reader.readLine()));

                System.out.println("Введіть номер телефону у форматі '+380ХХ-ХХХ-ХХ-ХХ' (без пробілів та тире):");
                statement.setString(5, phone = reader.readLine());

                System.out.println("Введіть дату народження у форматі 'РРРР-ММ-ДД':");
                statement.setDate(6, date = Date.valueOf(reader.readLine()));

                System.out.println("Введіть адресу:");
                statement.setString(7, location = reader.readLine());

                statement.execute();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete() throws IOException {
        fileRequest = new File("./src/main/java/java_JDBC_Hibernate/Lesson1/Task3/Requests/Delete.txt");
        fileReader = new BufferedReader(new FileReader(fileRequest));
        String remove = fileReader.readLine();

        try (Connection connection = DriverManager.getConnection(connect.url(), connect.login(), connect.password());
             PreparedStatement statement = connection.prepareStatement(remove)) {

            int id;

            System.out.println("Введіть id для видалення:");
            statement.setInt(1, id = Integer.parseInt(reader.readLine()));

            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update() throws IOException {
        System.out.println("Введіть id таблиці яку хочете змінити:");
        System.out.println("[1] - last_name;" + "\n[2] - first_name;" + "\n[3] - surname;" + "\n[4] - age;"
                + "\n[5] - phone" + "\n[6] - birthday;" + "\n[7] - location.");
        int tableID = Integer.parseInt(reader.readLine());


        writer(tableID);

        updating();
    }

    private void writer(int tableID) throws IOException {
        fileRequest = new File("./src/main/java/java_JDBC_Hibernate/Lesson1/Task3/Requests/Update.txt");

        PrintWriter printWriter = new PrintWriter(new FileWriter(fileRequest), false);

        System.out.println("Введіть id поля яке хочете змінити:");
        int id = Integer.parseInt(reader.readLine());

        System.out.println("Введіть зміни:");
        String update = reader.readLine();

        switch (tableID) {
            case 1 -> {
                String idEmployee = "UPDATE employees SET last_name = '" + update + "' WHERE id = " + id;
                printWriter.write(idEmployee);
                printWriter.flush();
            }
            case 2 -> {
                String idEmployee = "UPDATE employees SET first_name = '" + update + "' WHERE id = " + id;
                printWriter.write(idEmployee);
                printWriter.flush();
            }
            case 3 -> {
                String idEmployee = "UPDATE employees SET surname = '" + update + "' WHERE id = " + id;
                printWriter.write(idEmployee);
                printWriter.flush();
            }
            case 4 -> {
                String idEmployee = "UPDATE employees SET age = " + Integer.parseInt(update) + " WHERE id = " + id;
                printWriter.write(idEmployee);
                printWriter.flush();
            }
            case 5 -> {
                String idEmployee = "UPDATE employees SET phone = '" + update + "' WHERE id = " + id;
                printWriter.write(idEmployee);
                printWriter.flush();
            }
            case 6 -> {
                String idEmployee = "UPDATE employees SET birthday = '" + Date.valueOf(update) + "' WHERE id = " + id;
                printWriter.write(idEmployee);
                printWriter.flush();
            }
            case 7 -> {
                String idEmployee = "UPDATE employees SET location = '" + update + "' WHERE id = " + id;
                printWriter.write(idEmployee);
                printWriter.flush();
            }
            default -> {
                throw new IllegalStateException("Unexpected value: " + id);
            }
        }

    }

    private void updating() throws IOException {
        fileRequest = new File("./src/main/java/java_JDBC_Hibernate/Lesson1/Task3/Requests/Update.txt");
        fileReader = new BufferedReader(new FileReader(fileRequest));
        String update = fileReader.readLine();

        try (Connection connection = DriverManager.getConnection(connect.url(), connect.login(), connect.password());
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(update);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
