package task06;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class AddressBook implements Iterable {
    //Fields
    private NameAddressPair[] addressBooks;
    private int counter;

    //Constructor
    public AddressBook(int capacity) {
        addressBooks = new NameAddressPair[capacity];
        counter = (int) Arrays.stream(addressBooks).filter(Objects::nonNull).count();
    }

    //Methods

    public boolean create(String firstName, String lastName, String address) {
        if (counter >= addressBooks.length) {
            addressBooks = Arrays.copyOf(addressBooks, 2 * counter);
        }
        Person person = new Person(firstName, lastName);
        if (Arrays.stream(addressBooks).anyMatch(pair -> pair.person.equals(person))) {
            return false;
        }
        addressBooks[counter++] = new NameAddressPair(person, address);
        return true;
    }

    public String read(String firstName, String lastName) {
        Person person = new Person(firstName, lastName);
        String name = Arrays.stream(addressBooks)
                .filter(nameAddressPair -> nameAddressPair.person.equals(person))
                .findFirst()
                .toString();
        return name;
    }

    public boolean update(String firstName, String lastName, String address) {
        Person person = new Person(firstName, lastName);
        NameAddressPair nameAddressPair = new NameAddressPair(person, address);
        boolean updated = Arrays.stream(addressBooks)
                .filter(pair -> pair != null && pair.equals(nameAddressPair))
                .peek(pair -> pair.address = address)
                .findFirst()
                .isPresent();
        return updated;
    }

    public boolean delete(String firstName, String lastName) {
        return Arrays.asList(addressBooks)
                .removeIf(pair -> pair != null &&
                        pair.person != null &&
                        pair.person.equals(new Person(firstName, lastName)));

    }

    public int size() {
        return counter;
    }

    public void sortedBy(SortedOrder sortedOrder) {
        Arrays.sort(addressBooks);
    }

    @Override
    public Iterator iterator() {
        return new AddressBookIterator();
    }

    private class AddressBookIterator implements Iterator {
        private static int count = 0;

        @Override
        public boolean hasNext() {
            return count < addressBooks.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new ArrayIndexOutOfBoundsException("List with address absent.");
            }
            String nextAddressBook = addressBooks[count].toString();
            count++;
            return nextAddressBook;
        }
    }

    //Inner classes
    private static class NameAddressPair {
        private Person person;
        private String address;

        public NameAddressPair(Person person, String address) {
            this.person = person;
            this.address = address;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NameAddressPair that = (NameAddressPair) o;
            return Objects.equals(person, that.person) && Objects.equals(address, that.address);
        }

        @Override
        public int hashCode() {
            return Objects.hash(person, address);
        }

        @Override
        public String toString() {
            return person + ", Address: " + address;
        }
    }

    private static class Person {
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName);
        }

        @Override
        public String toString() {
            return "FirstName: " + firstName + ", LastName: " + lastName;
        }
    }

    enum SortedOrder {
        ASC, DESC;
    }
}
