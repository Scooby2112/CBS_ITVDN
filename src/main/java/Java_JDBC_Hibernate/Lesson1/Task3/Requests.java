package Java_JDBC_Hibernate.Lesson1.Task3;

import java.io.*;
import java.sql.*;

public class Requests {

    private static final String URL = "jdbc:mysql://localhost:3306/testdatabase";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";

    private final String INSERT = "INSERT INTO employees (last_name, first_name, surname, age, phone, birthday, location) "
            + "VALUES (?,?,?,?,?,?,?)";
    private final String DELETE = "DELETE FROM employees WHERE id = ?";

    private static final File FILE = new File("C:\\Users\\Вова\\IdeaProjects\\Java_ITVDN\\src\\main\\java\\Java_JDBC_Hibernate\\Lesson1\\Task2\\Update\\Update.txt");

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void insertInto() throws IOException {


        String lastName;
        String firstName;
        String surname;
        int age;
        String phone;
        Date date;
        String location;

        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(INSERT)) {

            for (int i = 0; i < 6; i++) {
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


        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(DELETE)) {

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

    protected void registerDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver load success");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writer(int tableID) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(FILE), false);

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

    private static void updating() throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(FILE));
        String update = fileReader.readLine();

        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(update);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
