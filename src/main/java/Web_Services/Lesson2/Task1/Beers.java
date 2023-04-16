package Web_Services.Lesson2.Task1;

import java.util.List;

public class Beers {
    private String manufacturer;
    private String name;
    private String type;
    private boolean alcohol;
    private List<String> ingredients;
    private String ABV;
    private String transparency;
    private boolean filtered;
    private String calories;

    public Beers() {
    }

    public Beers(String manufacturer, String name, String type, boolean alcohol, List<String> ingredients, String ABV, String transparency, boolean filtered, String calories) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.type = type;
        this.alcohol = alcohol;
        this.ingredients = ingredients;
        this.ABV = ABV;
        this.transparency = transparency;
        this.filtered = filtered;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

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

    public boolean getFiltered() {
        return filtered;
    }

    public void setFiltered(boolean filtered) {
        this.filtered = filtered;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Beers{" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", alcohol='" + alcohol + '\'' +
                ", ingredients=" + ingredients +
                ", characters=[" +
                "ABV='" + ABV + '\'' +
                ", transparency='" + transparency + '\'' +
                ", filtered='" + filtered + '\'' +
                ", calories='" + calories + '\'' + "]" +
                '}';
    }
}
