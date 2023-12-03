package task01;

public class Pizza {
    private String cheese;
    private String meat;
    private String seafood;
    private String vegetable;
    private String mushroom;

    private Pizza() {
    }

    public static PizzaBuilder base() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {
        private String cheese;
        private String meat;
        private String seafood;
        private String vegetable;
        private String mushroom;

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
            Pizza pizza = new Pizza();
            pizza.cheese = this.cheese;
            pizza.meat = this.meat;
            pizza.seafood = this.seafood;
            pizza.vegetable = this.vegetable;
            pizza.mushroom = this.mushroom;
            return pizza;
        }
    }
    public static Pizza cook() {
        return Pizza.base()
                .addCheese("Mozzarella")
                .addMeat("Pepperoni")
                .addVegetable("Mushrooms")
                .build();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheese='" + cheese + '\'' +
                ", meat='" + meat + '\'' +
                ", seafood='" + seafood + '\'' +
                ", vegetable='" + vegetable + '\'' +
                ", mushroom='" + mushroom + '\'' +
                '}';
    }
}


