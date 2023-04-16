package Web_Services.Lesson3.Task1;

import Web_Services.Lesson2.Task1.Beers;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class MyXPath {
    public List<Beers> getAll() {
        List<Beers> beerList = new ArrayList<>();

        try {
            File xmlFile = new File("src/main/resources/Beer.xsd.xml");
            FileInputStream inputStream = new FileInputStream(xmlFile);

            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(inputStream);

            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();

            String expression = "//Beer";
            NodeList nodeList = (NodeList) xpath.compile(expression).evaluate(xmlDocument, XPathConstants.NODESET);

            Beers beers = null;
            for (int i = 0; i < nodeList.getLength(); i++) {
                beers = new Beers();
                Element beerElement = (Element) nodeList.item(i);

                beers.setManufacturer(beerElement.getAttribute("Manufacturer"));
                beers.setName(beerElement.getElementsByTagName("Name").item(0).getTextContent());
                beers.setType(beerElement.getElementsByTagName("Type").item(0).getTextContent());
                beers.setAlcohol(Boolean.parseBoolean(beerElement.getElementsByTagName("Alcohol").item(0).getTextContent()));

                NodeList ingredientsList = beerElement.getElementsByTagName("Ingredient");
                List<String> ingredients = new ArrayList<>();
                for (int j = 0; j < ingredientsList.getLength(); j++) {
                    ingredients.add(ingredientsList.item(j).getTextContent());
                }
                beers.setIngredients(ingredients);

                Element charsElement = (Element) beerElement.getElementsByTagName("Chars").item(0);
                beers.setABV(charsElement.getElementsByTagName("ABV").item(0).getTextContent());
                beers.setTransparency(charsElement.getElementsByTagName("Transparency").item(0).getTextContent());
                beers.setFiltered(Boolean.parseBoolean(charsElement.getElementsByTagName("Filtered").item(0).getTextContent()));
                beers.setCalories(charsElement.getElementsByTagName("Calories").item(0).getTextContent());

                beerList.add(beers);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return beerList;
    }

    public void getAllV2() {
        XPathFactory factory = XPathFactory.newInstance();
        XPath path = factory.newXPath();
        try {
            XPathExpression expression = path.compile("//Beer//@* | //Beer//*");

            File xml = new File("src/main/resources/Beer.xsd.xml");
            InputSource source = new InputSource(new FileInputStream(xml));


            Object result = expression.evaluate(source, XPathConstants.NODESET);

            NodeList list = (NodeList) result;

            for (int i = 0; i < list.getLength(); i++) {
                System.out.println(list.item(i).getLocalName() + ": " + list.item(i).getFirstChild().getNodeValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllV3() {
        try {
            XPathFactory factory = XPathFactory.newInstance();
            XPath xpath = factory.newXPath();
            XPathExpression expr = xpath.compile("//Beer/* | //Beer/@*");

            File xml = new File("src/main/resources/Beer.xsd.xml");
            InputSource inputSource = new InputSource(new FileInputStream(xml));
            NodeList nodeList = (NodeList) expr.evaluate(inputSource, XPathConstants.NODESET);

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println(node.getLocalName() + ": " + node.getTextContent());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
