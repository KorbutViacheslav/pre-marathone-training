package task06;

import java.util.*;

public class AddressBook implements Iterable<AddressBook> {
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
        NameAddressPair.Person person = new NameAddressPair.Person(firstName, lastName);

        for (int i = 0; i < counter; i++) {
            if (addressBooks[i].person.equals(person)) {
                return false;
            }
        }
        addressBooks[counter++] = new NameAddressPair(person, address);
        return true;
    }

    public String read(String firstName, String lastName) {
        NameAddressPair.Person person = new NameAddressPair.Person(firstName, lastName);
        String name = Arrays.stream(addressBooks)
                .filter(nameAddressPair -> nameAddressPair.person.equals(person))
                .findFirst()
                .map(NameAddressPair::toString)
                .orElse("Person not found");
        return name;
    }

    public boolean update(String firstName, String lastName, String address) {
        NameAddressPair.Person person = new NameAddressPair.Person(firstName, lastName);
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
        NameAddressPair.Person personToDelete = new NameAddressPair.Person(firstName, lastName);
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
    public Iterator<AddressBook> iterator() {
        return new AddressBookIterator();
    }

    private class AddressBookIterator implements Iterator {
        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < addressBooks.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in the address book.");
            }
            NameAddressPair currentPair = addressBooks[count];
            String nextAddressBook = (currentPair != null) ? currentPair.toString() : "null";
            count++;
            return nextAddressBook;
        }
    }

    //Inner classes
    public static class NameAddressPair {
        private Person person;
        private String address;

        private NameAddressPair(Person person, String address) {
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

        private static class Person {
            private String firstName;
            private String lastName;

            private Person(String firstName, String lastName) {
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
    }
}

//Enum
enum SortedOrder {ASC, DESC}
