package Java_JDBC_Hibernate.Connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class Connect {
    private final Properties properties = new Properties();
    private final InputStream in;

    {
        try {
            in = new FileInputStream("./src/main/java/Java_JDBC_Hibernate/Connection/connect.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public String url(){
        try {
            properties.load(in);
            return properties.getProperty("URL");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String login(){
        try {
            properties.load(in);
            return properties.getProperty("LOGIN");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String password(){
        try {
            properties.load(in);
            return properties.getProperty("PASSWORD");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
