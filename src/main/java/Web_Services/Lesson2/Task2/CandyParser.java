package Web_Services.Lesson2.Task2;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class CandyParser {
    public List<Candies> getCandies(String file) {
        List<Candies> candies = new ArrayList<>();
        Candies candy = null;
        String elementName = null;
        List<String> composition = null;

        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(file));

            while (reader.hasNext()) {
                int event = reader.next();

                switch (event) {
                    case XMLStreamReader.START_ELEMENT: {
                        elementName = reader.getLocalName();
                        if ("Candy".equals(elementName)) {
                            candy = new Candies();
                            String name = reader.getAttributeValue(null, "Name");
                            candy.setName(name);
                            composition = new ArrayList<>();
                        }
                        if ("Composition".equals(elementName)) {
                            while (reader.hasNext()) {
                                int compositionEvent = reader.next();
                                if (compositionEvent == XMLStreamConstants.START_ELEMENT
                                        && "Composition".equals(reader.getLocalName())) {
                                    String component = reader.getElementText();
                                    composition.add(component);
                                } else if (compositionEvent == XMLStreamConstants.END_ELEMENT
                                        && "Composition".equals(reader.getLocalName())) {
                                    break;
                                }
                            }
                            candy.setComposition(composition);
                        }
                    }
                    break;
                    case XMLStreamReader.CHARACTERS:
                        String text = reader.getText().trim();
                        if (text.isEmpty()) {
                            break;
                        }
                        switch (elementName) {
                            case "Manufacturer": {
                                candy.setManufacturer(text);
                                break;
                            }
                            case "Type": {
                                candy.setType(text);
                                break;
                            }
                            case "Weight": {
                                candy.setWeight(Double.parseDouble(text));
                                break;
                            }
                            case "ExpirationDate": {
                                candy.setExpirationDate(text);
                                break;
                            }
                        }
                        break;
                    case XMLStreamReader.END_ELEMENT: {
                        elementName = reader.getLocalName();
                        if ("Candy".equals(elementName)) {
                            candies.add(candy);
                        }
                        break;
                    }
                }
            }
        } catch (
                Exception e) {
            e.printStackTrace();
        }
        return candies;
    }
}
