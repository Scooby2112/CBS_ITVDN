package Java_4_Advanced.Lesson7.Task2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.NONE)
public class City {
    @XmlElement(name = "cityValue")
    public String value;
    @XmlElement(name = "street")
    public Street street;

    @Override
    public String toString() {
        return "City{" +
                "value='" + value + '\'' +
                ", street=" + street +
                '}';
    }
}
