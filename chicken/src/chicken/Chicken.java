package chicken;

public class Chicken {
    final Object first;
    
    public Chicken(Egg egg) {
        first = egg.first;
    }
    
    public void ask() {
        // The goal is to reach this line
        System.out.println("First there was the " + first);
    }
}
