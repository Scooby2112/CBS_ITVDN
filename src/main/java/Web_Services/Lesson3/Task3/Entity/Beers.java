package Web_Services.Lesson3.Task3.Entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Beers")
public class Beers {
    @XmlElement(name = "Beer")
    private List<Beer> beer;

    public List<Beer> getBeers() {
        return beer;
    }

    public void setBeers(List<Beer> beer) {
        this.beer = beer;
    }

    @Override
    public String toString() {
        return "Beers{" +
                "beer=" + beer +
                '}';
    }
}
