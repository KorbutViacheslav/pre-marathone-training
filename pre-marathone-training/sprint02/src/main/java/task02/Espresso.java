package task02;

public class Espresso extends Coffee {
    public Espresso(String name, int rating) {
        super(name, rating);
        ingredients.put("Water", 50);
        ingredients.put("Arabica", 20);
    }
}
