package task06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class AddressBook implements Iterable {
    //Fields
    private NameAddressPair[] addressBooks;
    private int counter = 0;

    public NameAddressPair[] getAddressBooks() {
        return addressBooks;
    }

    //Constructor
    public AddressBook(int capacity) {
        addressBooks = new NameAddressPair[capacity];
    }

    //Methods

    public boolean create(String firstName, String lastName, String address) {
        if (counter >= addressBooks.length) {
            addressBooks = Arrays.copyOf(addressBooks, 2 * counter);
        }
        Person person = new Person(firstName, lastName);

        for (int i = 0; i < counter; i++) {
            if (addressBooks[i].person.equals(person)) {
                return false;
            }
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
        return Arrays.stream(addressBooks)
                .filter(pair -> pair.person.equals(person))
                .findFirst()
                .map(pair -> {
                    pair.address = address;
                    return true;
                })
                .orElse(false);
    }

    public boolean delete(String firstName, String lastName) {
        Person personToDelete = new Person(firstName, lastName);
        for (int i = 0; i < counter; i++) {
            if (addressBooks[i].person.equals(personToDelete)) {
                System.arraycopy(addressBooks, i + 1, addressBooks, i, addressBooks.length - 1 - i);
                counter--;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return counter;
    }

    public void sortedBy(SortedOrder sortedOrder) {
        Arrays.sort(addressBooks, new Comparator<NameAddressPair>() {
            @Override
            public int compare(NameAddressPair o1, NameAddressPair o2) {
                int result = o1.person.firstName.compareTo(o2.person.firstName);
                if (result == 0) {
                    result = o1.person.lastName.compareTo(o2.person.lastName);
                }
                return sortedOrder == SortedOrder.ASC ? result : -result;
            }
        });
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
    public static class NameAddressPair {
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
