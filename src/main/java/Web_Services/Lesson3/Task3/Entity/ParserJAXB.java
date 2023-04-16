package Web_Services.Lesson3.Task3.Entity;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class ParserJAXB {
    public List<Beer> JAXBParser() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Beers.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();

        Beers beers = (Beers) unmarshaller.unmarshal(new File("src/main/resources/Beer.xsd.xml"));

        return beers.getBeers();

    }
}
