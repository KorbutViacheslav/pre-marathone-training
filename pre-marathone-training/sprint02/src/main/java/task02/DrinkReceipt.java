package task02;

public interface DrinkReceipt {
    String getName();

    DrinkReceipt addComponent(String componentName, int componentCount);
}
