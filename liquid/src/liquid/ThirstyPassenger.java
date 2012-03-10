package liquid;

import java.util.ArrayList;

public class ThirstyPassenger {
    public static void main(String[] args) {
        final Object[] items = {"toothbrush"};

        Luggage luggage = new Luggage(new ArrayList<String>() {
            @Override public Object[] toArray() {
                return items;
            }
        });

        items[0] = "liquid water";
        luggage.fly();
    }
}
