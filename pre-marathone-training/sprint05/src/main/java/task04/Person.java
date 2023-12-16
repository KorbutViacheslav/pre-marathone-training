package task04;

class Person {
    private String name;
    DecisionMethod goShopping = (productName, discount) -> productName.equals("product1") && discount > 10;

    public Person(String name) {
        this.name = name;
    }

    @FunctionalInterface
    interface DecisionMethod {
        boolean method(String productName, int discount);
    }
}
