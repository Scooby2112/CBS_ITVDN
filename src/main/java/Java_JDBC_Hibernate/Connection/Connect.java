package Java_JDBC_Hibernate.Connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Connect {
    private final String filename;
    private final String driverName;
    private final Properties properties = new Properties();

    public Connect(String filename, String driverName) {
        this.filename = filename;
        this.driverName = driverName;
    }

    public Connect loadProperties() {
        try {
            var in = new FileInputStream(filename);
            properties.load(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public Connect loadDriver() {
        try {
            Class.forName(driverName);
            System.out.println("Driver load success");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public String url() {
        return properties.getProperty("URL");
    }

    public String login() {
        return properties.getProperty("LOGIN");
    }

    public String password() {
        return properties.getProperty("PASSWORD");
    }
}
