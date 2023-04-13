package Web_Services.Lesson2.Task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Beers> beersList = new ArrayList<>();
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("src/main/resources/Beer.xsd.xml");
            Element beersElement = doc.getDocumentElement();

            NodeList nodeList = beersElement.getElementsByTagName("Beer");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                Beers beers = new Beers();

                beers.setManufacturer(element.getAttribute("Manufacturer"));
                beers.setName(element.getElementsByTagName("Name").item(0).getTextContent());
                beers.setType(element.getElementsByTagName("Type").item(0).getTextContent());
                beers.setAlcohol(Boolean.parseBoolean(element.getElementsByTagName("Alcohol").item(0).getTextContent()));
                beers.setABV(element.getElementsByTagName("ABV").item(0).getTextContent());
                beers.setTransparency(element.getElementsByTagName("Transparency").item(0).getTextContent());
                beers.setFiltered(Boolean.parseBoolean(element.getElementsByTagName("Filtered").item(0).getTextContent()));
                beers.setCalories(element.getElementsByTagName("Calories").item(0).getTextContent());

                Element ingredientsElement = (Element) beersElement.getElementsByTagName("Ingredients").item(0);
                NodeList ingredientsList = ingredientsElement.getElementsByTagName("Ingredient");
                List<String> ingredients = new ArrayList<>();

                for (int j = 0; j < ingredientsList.getLength(); j++) {
                    Node ingredientsNode = ingredientsList.item(j);
                    if (ingredientsNode.getNodeType() == Node.ELEMENT_NODE){
                        Element ingredientElement = (Element) ingredientsNode;
                        String ingredient = ingredientElement.getTextContent();
                        ingredients.add(ingredient);
                    }
                }
                beers.setIngredients(ingredients);
                beersList.add(beers);
            }
            beersList.sort(new MyComparator());
            for (Beers beers : beersList){
                System.out.println(beers);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
