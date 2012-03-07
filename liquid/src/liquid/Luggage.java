package liquid;

import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Luggage {
    private final Collection<String> items;

    public Luggage(Collection<String> items) {
        items = Collections.unmodifiableCollection(new ArrayList<String>(items));
        for (String item : items) {
            if (item.contains("liquid")) {
                throw new SecurityException("No liquids allowed in your hand luggage!");
            }
        }
        this.items = items;
    }

    public Collection<String> getItems() {
        return items;
    }

    public void fly() {
        if (items.contains("liquid water")) {
            // The goal is to reach this line
            System.out.println("Oh no, water on a plane! We're all going to die!");
        }
    }
}