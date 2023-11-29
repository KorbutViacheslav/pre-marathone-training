package task02;

public class Cappuccino extends Coffee {
    public Cappuccino(String name, int rating) {
        super(name, rating);
        ingredients.put("Water", 100);
        ingredients.put("Arabica", 20);
        ingredients.put("Milk", 50);
    }
}
