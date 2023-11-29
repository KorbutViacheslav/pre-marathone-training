package task02;

import java.util.HashMap;
import java.util.Map;

public class Coffee implements DrinkPreparation, DrinkReceipt, Rating {
    protected String name;
    protected int rating;
    protected Map<String, Integer> ingredients;

    public Coffee(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.ingredients = new HashMap<>();
    }

    @Override
    public Map<String, Integer> makeDrink() {
        return ingredients;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        ingredients.put(componentName, componentCount);
        return this;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
