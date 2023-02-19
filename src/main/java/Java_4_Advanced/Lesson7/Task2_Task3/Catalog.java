package Java_4_Advanced.Lesson7.Task2_Task3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "catalog")
public class Catalog {
    @XmlElement(name = "city")
    public City city;

    @Override
    public String toString() {
        return "Catalog{" +
                "city=" + city +
                '}';
    }
}
