package task01;

public class MainS3T1 {
    public static void main(String[] args) {
        Pizza pizza = Pizza.base()
                .addCheese("Cheese")
                .addMeat("Meat")
                .addMushroom("Mushroom")
                .build();
        System.out.println(pizza);
        System.out.println();

        // My new version task01
        PizzaV2 pizzaV2 = PizzaV2.base()
                .addCheese("asd")
                .addVegetable("asd")
                .addMeat("Asd")
                .build();
        System.out.println(pizzaV2);
    }

}
