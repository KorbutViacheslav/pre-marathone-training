package task01;

public class MainS3T1 {
    public static void main(String[] args) {
        Pizza pizza =Pizza.base().addCheese("Cheese").addMeat("Meat").addMushroom("Mushroom").build();
        System.out.println(pizza);
    }
}
