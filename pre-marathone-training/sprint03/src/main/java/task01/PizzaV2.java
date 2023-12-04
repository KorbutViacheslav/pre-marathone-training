package task01;

public class PizzaV2 {
    private String cheese;
    private String meat;
    private String seafood;
    private String vegetable;
    private String mushroom;

    public static class PizzaBuilderV2 {
        private final PizzaV2 pizza;

        public PizzaBuilderV2() {
            pizza = new PizzaV2();
        }

        public PizzaBuilderV2 addCheese(String cheese) {
            pizza.cheese = cheese;
            return this;
        }

        public PizzaBuilderV2 addMeat(String meat) {
            pizza.meat = meat;
            return this;
        }

        public PizzaBuilderV2 addSeaFood(String seaFood) {
            pizza.seafood = seaFood;
            return this;
        }

        public PizzaBuilderV2 addVegetable(String vegetable) {
            pizza.vegetable = vegetable;
            return this;
        }

        public PizzaBuilderV2 addMushroom(String mushroom) {
            pizza.mushroom = mushroom;
            return this;
        }

        public PizzaV2 build() {
            return pizza;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Pizza{");

        if (cheese != null) {
            result.append("cheese='").append(cheese).append('\'').append(", ");
        }
        if (meat != null) {
            result.append("meat='").append(meat).append('\'').append(", ");
        }
        if (seafood != null) {
            result.append("seafood='").append(seafood).append('\'').append(", ");
        }
        if (vegetable != null) {
            result.append("vegetable='").append(vegetable).append('\'').append(", ");
        }
        if (mushroom != null) {
            result.append("mushroom='").append(mushroom).append('\'');
        }

        if (result.charAt(result.length() - 2) == ',') {
            result.delete(result.length() - 2, result.length());
        }

        result.append('}');
        return result.toString();
    }
}
