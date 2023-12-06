package task01;

public class Pizza {
    private String cheese;
    private String meat;
    private String seafood;
    private String vegetable;
    private String mushroom;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.cheese = pizzaBuilder.cheese;
        this.meat = pizzaBuilder.meat;
        this.seafood = pizzaBuilder.seafood;
        this.vegetable = pizzaBuilder.vegetable;
        this.mushroom = pizzaBuilder.mushroom;
    }

    public static PizzaBuilder base() {
        return new PizzaBuilder();
    }

    public static Pizza cook() {
        return Pizza.base()
                .addMeat("meat")
                .addVegetable("vegetable")
                .addCheese("cheese")
                .build();
    }

    public String getCheese() {
        return cheese;
    }

    public String getMeat() {
        return meat;
    }

    public String getSeafood() {
        return seafood;
    }

    public String getVegetable() {
        return vegetable;
    }

    public String getMushroom() {
        return mushroom;
    }

    public static class PizzaBuilder {
        private String cheese;
        private String meat;
        private String seafood;
        private String vegetable;
        private String mushroom;

        private PizzaBuilder() {
        }

        public PizzaBuilder addCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder addMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public PizzaBuilder addSeaFood(String seaFood) {
            this.seafood = seaFood;
            return this;
        }

        public PizzaBuilder addVegetable(String vegetable) {
            this.vegetable = vegetable;
            return this;
        }

        public PizzaBuilder addMushroom(String mushroom) {
            this.mushroom = mushroom;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
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


