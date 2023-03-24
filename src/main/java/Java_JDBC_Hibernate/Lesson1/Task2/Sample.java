package Java_JDBC_Hibernate.Lesson1.Task2;

import Java_JDBC_Hibernate.Connection.Connect;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Sample {

    private final Connect connect = new Connect(
            "./src/main/java/Java_JDBC_Hibernate/Connection/connect.properties",
            "com.mysql.jdbc.Driver"
    ).loadProperties().loadDriver();


    public List<ContactDetails> getContactDetails() {
        return getContactDetailsByQuery("""
                SELECT last_name, first_name, phone, location
                FROM employees
                INNER JOIN about_employees ON employees.id = about_employees.id_employee""");
    }

    public List<ContactDetails> getContactDetails2() {
        return getContactDetailsByQuery("""
                SELECT last_name, first_name, phone, birthday
                FROM employees
                INNER JOIN about_employees ON employees.id = about_employees.id_employee
                WHERE marital_status = 'not married'""");
    }

    public List<ContactDetails> getContactDetails3() {
        return getContactDetailsByQuery("""
                SELECT last_name, first_name, phone, birthday
                FROM employees
                INNER JOIN about_employees ON employees.id = about_employees.id_employee
                WHERE id_position = 3""");
    }

    private List<ContactDetails> getContactDetailsByQuery(String query) {
        var contactDetails = new ArrayList<ContactDetails>();

        try (var connection = DriverManager.getConnection(connect.url(), connect.login(), connect.password());
             var statement = connection.createStatement()) {

            var resultSet = statement.executeQuery(query);

            while (resultSet.next()) contactDetails.add(convertToContractDetails(resultSet));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return contactDetails;
    }

    private ContactDetails convertToContractDetails(ResultSet resultSet) throws SQLException {
        var lastName = resultSet.getString("last_name");
        var firstName = resultSet.getString("first_name");
        var phone = resultSet.getString("phone");
        var location = resultSet.getString("location");
        var date = resultSet.getDate("birthday");
        return new ContactDetails(lastName, firstName, phone, location, date);
    }
}
