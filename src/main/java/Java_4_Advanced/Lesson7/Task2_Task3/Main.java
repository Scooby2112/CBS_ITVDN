package Java_4_Advanced.Lesson7.Task2_Task3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
//        writeXML();
//        parseSAX();
        parseJAXB();
    }

    public static void parseJAXB() throws JAXBException {
        File file = new File("src/main/java/Java_4_Advanced/Lesson7/Task2_Task3/File.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Catalog catalog = (Catalog) unmarshaller.unmarshal(file);
        System.out.println(catalog);
    }

    public static void parseSAX() {
        String file = "file:///C:\\Users\\Вова\\IdeaProjects\\Java_ITVDN\\Java_04_Advanced\\src\\main\\java\\Java_4_Advanced\\Lesson7\\Task2_Task3\\File.xml";
        SAXParserFactory factory = SAXParserFactory.newInstance();

        try {
            SAXParser parser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {
                boolean street = false;
                boolean city = false;
                boolean house = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("city")) {
                        city = true;
                    }
                    if (qName.equalsIgnoreCase("street")) {
                        street = true;
                    }
                    if (qName.equalsIgnoreCase("house")) {
                        house = true;
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (city) {
                        System.out.println("City: " + new String(ch, start, length));
                        city = false;
                    }
                    if (street) {
                        System.out.println("Street: " + new String(ch, start, length));
                        street = false;
                    }
                    if (house) {
                        System.out.println("House " + new String(ch, start, length));
                        house = false;
                    }
                }
            };
            parser.parse(file, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeXML() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            // ОТРИМУЄМО ОБ’ЄКТ DOCUMENT BUILDER
            DocumentBuilder db = dbf.newDocumentBuilder();

            // СТВОРЮЄМО ЧИСТИЙ ДОКУМЕНТ
            Document doc = db.newDocument();

            // СТВОРЮЄМО КАТАЛОГ
            Element rootElement = doc.createElement("catalog");
            doc.appendChild(rootElement);

            // СТВОРЮЄМО ТЕГ МІСТА
            Element city1 = doc.createElement("city");

            // МІСТО ЗАНОСИМО В КАТАЛОГ
            rootElement.appendChild(city1);

            // ДАЛІ ПОВТОРЮЄМО
            Element street = doc.createElement("street");

            // СТВОРЮЄМО ТЕГ ДЛЯ ЗАПИСУ ЯКОГОСЬ ЗНАЧЕННЯ (ДЛЯ 4 ЗАВДАННЯ)
            Element cityValue = doc.createElement("cityValue");

            // ЗАПИСУЄМО НАЗВУ МІСТА
            cityValue.setTextContent("Kiev");

            // ЗАПИСУЄМО АТРИБУТ
            cityValue.setAttribute("size", "big");
            city1.appendChild(cityValue);
            city1.appendChild(street);

            // ДАЛІ ПОВТОРЮЄМО
            Element house = doc.createElement("house");
            Element streetValue = doc.createElement("streetValue");
            streetValue.setTextContent("Lomonosova");
            street.appendChild(streetValue);
            house.setTextContent("№67");
            street.appendChild(house);

            // СТВОРЮЄМО ТРАНСФОРМЕР
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();

            DOMSource source = new DOMSource(doc);
            StreamResult sr = new StreamResult(new File("src/main/java/Java_4_Advanced/Lesson7/Task2_Task3/File.xml"));

            // ТРАНСФОРМУЄМО З ДЖЕРЕЛА В ФАЙЛ
            t.transform(source, sr);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}