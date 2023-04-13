package Web_Services.Lesson2.Task1;

import java.util.Comparator;

public class MyComparator implements Comparator<Beers> {
    @Override
    public int compare(Beers o1, Beers o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
