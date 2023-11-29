package task01;

public class MainS02T01 {
    public static void main(String[] args) {
        Child child = new Child(5, "Very good", "Kate", "0510001");
        Adult adult = new Adult(32, "Good", "Mary", "320101");
        System.out.println(child.getHealthStatus() + " " + child.childIDNumber);
        System.out.println(adult.getHealthStatus() + " " + adult.passportNumber);
    }
}
