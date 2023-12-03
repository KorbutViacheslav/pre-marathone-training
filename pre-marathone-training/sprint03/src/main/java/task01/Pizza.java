package task01;

public class Pizza {
    private String cheese;
    private String meat;
    private String seafood;
    private String vegetable;
    private String mushroom;

    private Pizza() {
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getSeafood() {
        return seafood;
    }

    public void setSeafood(String seafood) {
        this.seafood = seafood;
    }

    public String getVegetable() {
        return vegetable;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    public String getMushroom() {
        return mushroom;
    }

    public void setMushroom(String mushroom) {
        this.mushroom = mushroom;
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

        void addSeaFood(String seaFood) {
        }

        void addVegetable(String vegetable) {
        }

        void addMushroom(String mushroom) {
        }

        public Pizza build() {
            return new Pizza();
        }
    }
}


