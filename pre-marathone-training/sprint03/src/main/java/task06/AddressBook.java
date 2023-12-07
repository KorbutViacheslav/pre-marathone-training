package task06;

import java.util.Iterator;

public class AddressBook implements Iterable {
    private AddressBook[] addressBooks;
    private int counter = 0;

    public boolean create(String firstName, String lastName, String address) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    private class AddressBookIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }

    private static class NameAddressPair {
        private Person person;
        private String address;

        public NameAddressPair(Person person, String address) {
            this.person = person;
            this.address = address;
        }
    }

    private static class Person {
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    enum SortedOrder {
        ASC, DESC;
    }
}
