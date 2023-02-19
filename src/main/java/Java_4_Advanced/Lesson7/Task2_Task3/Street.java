package Java_4_Advanced.Lesson7.Task2_Task3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.NONE)
public class Street {
    @XmlElement(name = "streetValue")
    public String value;
    @XmlElement(name = "house")
    public String house;

    @Override
    public String toString() {
        return "Street{" +
                "value='" + value + '\'' +
                ", house=" + house +
                '}';
    }
}

