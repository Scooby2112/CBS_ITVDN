package Web_Services.Lesson2.Task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CandyParser parser = new CandyParser();
        List<Candies> candiesList = parser.getCandies("src/main/resources/Сandies.xsd.xml");
        for (Candies candies : candiesList){
            System.out.println("Name = " + candies.getName() + ", manufacturer = " + candies.getManufacturer()
                    + ", type = " + candies.getType() + ", weight = " + candies.getWeight()
                    + ", composition = " + candies.getComposition() + ", expiration date = " + candies.getExpirationDate());
        }
    }
}
