package Java_JDBC_Hibernate.Lesson1.Task1;

import java.util.Date;

public class ContactDetails {
    private String lastName;
    private String firstName;
    private String phone;
    private String location;
    private Date date;
    public ContactDetails(String lastName, String firstName, String phone, String location) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.location = location;
    }

    public ContactDetails(String lastName, String firstName, String phone, Date date) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.date = date;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public String getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }
}
