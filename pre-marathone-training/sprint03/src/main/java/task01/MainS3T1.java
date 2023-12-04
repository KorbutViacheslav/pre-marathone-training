package task01;

public class MainS3T1 {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .addCheese("Cheese")
                .addMeat("Meat")
                .addMushroom("Mushroom")
                .build();
        System.out.println(pizza);
        System.out.println();
        // My new version task01
        PizzaV2 pizzaV2 = new PizzaV2.PizzaBuilderV2()
                .addVegetable("Vegetable")
                .addSeaFood("SeaFood")
                .addCheese("Cheese")
                .build();
        System.out.println(pizzaV2);
    }

}
