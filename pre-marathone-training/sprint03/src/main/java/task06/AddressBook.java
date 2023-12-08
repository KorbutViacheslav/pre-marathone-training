package task06;

import java.util.Iterator;

public class AddressBook implements Iterable {
    //Fields
    private NameAddressPair[] addressBooks;
    private int counter = 0;

    //Constructor
    public AddressBook(int capacity) {

    }

    //Methods

    public boolean create(String firstName, String lastName, String address) {
        return false;
    }

    public String read(String firstName, String lastName) {
        return null;
    }

    public boolean update(String firstName, String lastName, String address) {
        return false;
    }

    public boolean delete(String firstName, String lastName) {
        return false;
    }

    public int size() {
        return 0;
    }

    public void sortedBy(SortedOrder sortedOrder) {

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

    //Inner classes
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
