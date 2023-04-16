package Web_Services.Lesson3.Task3.Entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.NONE)
public class Ingredient {
    @XmlElement(name = "Ingredient")
    private List<String> ingredient;

    public List<String> getIngredient() {
        return ingredient;
    }

    public void setIngredient(List<String> ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String toString() {
        return ingredient.toString();
    }
}
