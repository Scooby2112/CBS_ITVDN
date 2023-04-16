package Web_Services.Lesson3.Task2;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class MyTransformer {
    public static void main(String[] args) throws TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        Source xslt = new StreamSource(new File("src/main/resources/transform.xsl"));
        Transformer transformer = factory.newTransformer(xslt);

        Source xml = new StreamSource(new File("src/main/resources/Beer.xsd.xml"));
        transformer.transform(xml, new StreamResult(new File("beers-transformed.xml")));
    }
}
