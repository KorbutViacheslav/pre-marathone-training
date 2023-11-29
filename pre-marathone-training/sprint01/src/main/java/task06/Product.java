package task06;

public class Product {
    private String name;
    private double price;
    private static int count;

    {
        count++;
    }

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int count() {
        return count;
    }

    static class Main {
        public static void main(String[] args) {
            Product product1 = new Product("Milk", 5);
            Product product2 = new Product("Apple", 3);
            Product product3 = new Product("Bread", 1);
            Product product4 = new Product("Potato", 2);
            Product product5 = new Product("Water", 1);
            System.out.println(Product.count());
        }
    }
}
