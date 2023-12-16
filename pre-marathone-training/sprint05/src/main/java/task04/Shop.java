package task04;

import java.util.List;

class Shop {
    private final List<Person> people;

    public Shop(List<Person> people) {
        this.people = people;
    }

    public int sale(String productName, int discount) {
        return (int) people.stream()
                .filter(person -> person.goShopping.method(productName, discount))
                .count();
    }
}
