package Web_Services.Lesson2.Task2;

import java.util.List;

public class Candies {
    private String name;
    private String manufacturer;
    private String type;
    private double weight;
    private List<String> composition;
    private String expirationDate;

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<String> getComposition() {
        return composition;
    }

    public void setComposition(List<String> composition) {
        this.composition = composition;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Candies{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", composition=" + composition +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
