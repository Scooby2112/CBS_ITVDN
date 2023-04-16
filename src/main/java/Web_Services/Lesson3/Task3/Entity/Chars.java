package Web_Services.Lesson3.Task3.Entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Chars extends Beer{
    @XmlElement(name = "ABV")
    private String ABV;
    @XmlElement(name = "Transparency")
    private String transparency;
    @XmlElement(name = "Filtered")
    private String filtered;
    @XmlElement(name = "Calories")
    private String calories;

    public String getABV() {
        return ABV;
    }

    public void setABV(String ABV) {
        this.ABV = ABV;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public String getFiltered() {
        return filtered;
    }

    public void setFiltered(String filtered) {
        this.filtered = filtered;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "[" +
                "ABV=" + ABV +
                ", transparency=" + transparency +
                ", filtered=" + filtered +
                ", calories=" + calories + "]";
    }
}
