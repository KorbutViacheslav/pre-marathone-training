package task01;

public class PizzaV2 {
    private String cheese;
    private String meat;
    private String seafood;
    private String vegetable;
    private String mushroom;

    public static PizzaBuilderV2 base() {
        return new PizzaBuilderV2();
    }

    public static PizzaV2 cook() {
        return PizzaV2.base()
                .addMeat("meatV2")
                .addVegetable("vegetableV2")
                .addCheese("cheeseV2")
                .build();
    }

    public static class PizzaBuilderV2 {
        private final PizzaV2 pizzaV2;

        private PizzaBuilderV2() {
            pizzaV2 = new PizzaV2();
        }

        public PizzaBuilderV2 addCheese(String cheese) {
            pizzaV2.cheese = cheese;
            return this;
        }

        public PizzaBuilderV2 addMeat(String meat) {
            pizzaV2.meat = meat;
            return this;
        }

        public PizzaBuilderV2 addSeaFood(String seaFood) {
            pizzaV2.seafood = seaFood;
            return this;
        }

        public PizzaBuilderV2 addVegetable(String vegetable) {
            pizzaV2.vegetable = vegetable;
            return this;
        }

        public PizzaBuilderV2 addMushroom(String mushroom) {
            pizzaV2.mushroom = mushroom;
            return this;
        }

        public PizzaV2 build() {
            return pizzaV2;
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
