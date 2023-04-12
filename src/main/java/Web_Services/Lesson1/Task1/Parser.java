package Web_Services.Lesson1.Task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Parser {
    public void parseSax(){
        String file = "src/main/resources/Beer.xsd.xml";
        SAXParserFactory factory = SAXParserFactory.newInstance();

        try {
            SAXParser parser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler(){
              boolean name = false;
              boolean type = false;
              boolean alcohol = false;
              boolean ingredients = false;
              boolean abv = false;
              boolean transparency = false;
              boolean filtered = false;
              boolean calories = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

                    String attribute = attributes.getValue("Manufacturer");
                    if (attribute != null && !attribute.isEmpty()){
                        System.out.println(attribute);
                    }
                    if (qName.equalsIgnoreCase("name")){
                        name = true;
                    }
                    if (qName.equalsIgnoreCase("type")){
                        type = true;
                    }
                    if (qName.equalsIgnoreCase("alcohol")){
                        alcohol = true;
                    }
                    if (qName.equalsIgnoreCase("ingredient")){
                        ingredients = true;
                    }
                    if (qName.equalsIgnoreCase("abv")){
                        abv = true;
                    }
                    if (qName.equalsIgnoreCase("transparency")){
                        transparency = true;
                    }
                    if (qName.equalsIgnoreCase("filtered")){
                        filtered = true;
                    }
                    if (qName.equalsIgnoreCase("calories")){
                        calories = true;
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (name){
                        System.out.println("Name: " + new String(ch, start, length));
                        name = false;
                    }
                    if (type){
                        System.out.println("Type: " + new String(ch, start, length));
                        type = false;
                    }
                    if (alcohol){
                        System.out.println("Alcohol: " + new String(ch, start, length));
                        alcohol = false;
                    }
                    if (ingredients){
                        System.out.println("Ingredient: " + new String(ch, start, length));
                        ingredients = false;
                    }
                    if (abv) {
                        System.out.println("ABV: " + new String(ch, start, length));
                        abv = false;
                    }
                    if (transparency){
                        System.out.println("Transparency: " + new String(ch, start, length));
                        transparency = false;
                    }
                    if (filtered){
                        System.out.println("Filtered: " + new String(ch, start, length));
                        filtered = false;
                    }
                    if (calories){
                        System.out.println("Calories: " + new String(ch, start, length));
                        calories = false;
                    }
                }
            };
            parser.parse(file, handler);
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
