package Web_Services.Lesson3.Task3;

import Web_Services.Lesson3.Task3.Entity.Beer;
import Web_Services.Lesson3.Task3.Entity.ParserJAXB;

import javax.xml.bind.JAXBException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException {
        ParserJAXB parserJAXB = new ParserJAXB();
        List<Beer> beers = parserJAXB.JAXBParser();

        for (Beer beer : beers){
            System.out.println("Manufacturer: " + beer.getManufacturer() + "\nName: " + beer.getName() +
                    "\nType: " + beer.getType() + "\nAlcohol: " + beer.getAlcohol() +
                    "\nIngredient: " + beer.getIngredient() + "\nChars: " + "\n\tABV: " + beer.getChars().getABV()
                    + "\n\tTransparency: " + beer.getChars().getTransparency() + "\n\tFiltered: " + beer.getChars().getFiltered()
                    + "\n\tCalories: " + beer.getChars().getCalories() + "\n");
        }
    }
}
