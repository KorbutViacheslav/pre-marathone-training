package task04;

import java.util.List;

public class MainS5T4 {
    public static void main(String[] args) {
        Shop shop = new Shop(List.of(
                new Person("Mike"),
                new Person("Tom"),
                new Person("John"),
                new Person("Daniel")));

        System.out.println(shop.sale("product1", 11));
        System.out.println(shop.sale("product1", 18));
        System.out.println(shop.sale("product1", 10));
    }
}
