package Java_JDBC_Hibernate.Lesson1.Task2;

import Java_JDBC_Hibernate.Connection.Connect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Sample {

    private final Connect connect = new Connect();

    public Sample() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver load success");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ContactDetails> getContactDetails() {

        List<ContactDetails> contactDetails = new ArrayList<>();

        try(Connection connection = DriverManager.getConnection(connect.url(), connect.login(), connect.password());
            Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(
                    "SELECT last_name, first_name, phone, location FROM employees INNER JOIN about_employees ON employees.id = about_employees.id_employee");

            while (resultSet.next()) {
                String lastName = resultSet.getString("last_name");
                String firstName = resultSet.getString("first_name");
                String phone = resultSet.getString("phone");
                String location = resultSet.getString("location");
                ContactDetails contactDetail = new ContactDetails(lastName, firstName, phone, location);
                contactDetails.add(contactDetail);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contactDetails;
    }

    public List<ContactDetails> getContactDetails2() {

        List<ContactDetails> contactDetails = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(connect.url(), connect.login(), connect.password());
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(
                    "SELECT last_name, first_name, phone, birthday FROM employees INNER JOIN about_employees ON employees.id = about_employees.id_employee WHERE marital_status = 'not married'");

            while (resultSet.next()) {
                String lastName = resultSet.getString("last_name");
                String firstName = resultSet.getString("first_name");
                String phone = resultSet.getString("phone");
                Date date = resultSet.getDate("birthday");
                ContactDetails contactDetail = new ContactDetails(lastName, firstName, phone, date);
                contactDetails.add(contactDetail);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contactDetails;
    }

    public List<ContactDetails> getContactDetails3() {
        List<ContactDetails> contactDetails = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(connect.url(), connect.login(), connect.password());
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(
                    "SELECT last_name, first_name, phone, birthday FROM employees INNER JOIN about_employees ON employees.id = about_employees.id_employee WHERE id_position = 3");

            while (resultSet.next()) {
                String lastName = resultSet.getString("last_name");
                String firstName = resultSet.getString("first_name");
                String phone = resultSet.getString("phone");
                Date date = resultSet.getDate("birthday");
                ContactDetails contactDetail = new ContactDetails(lastName, firstName, phone, date);
                contactDetails.add(contactDetail);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contactDetails;
    }
}
