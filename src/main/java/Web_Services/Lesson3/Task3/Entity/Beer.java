package Web_Services.Lesson3.Task3.Entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Beer {
    @XmlAttribute(name = "Manufacturer")
    private String manufacturer;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "Type")
    private String type;
    @XmlElement(name = "Alcohol")
    private String alcohol;
    @XmlElement(name = "Ingredients")
    private Ingredient ingredient;
    @XmlElement(name = "Chars")
    private Chars chars;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public Chars getChars() {
        return chars;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", alcohol='" + alcohol + '\'' +
                ", ingredient=" + ingredient +
                ", chars=" + chars +
                '}';
    }
}
