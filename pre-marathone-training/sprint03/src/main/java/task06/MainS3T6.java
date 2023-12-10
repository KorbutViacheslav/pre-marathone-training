package task06;

import java.util.Arrays;

public class MainS3T6 {
    public static void main(String[] args) {
        //Created new addressBook and added Person
        AddressBook addressBook = new AddressBook(3);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("Steven", "Taylor", "Address #1");

        //Checked how work update method and print status and print update Person
        boolean updateStatus = addressBook.update("Steven", "Taylor", "Address #3");
        System.out.println("Update status: " + updateStatus);
        System.out.println(addressBook.read("Steven", "Taylor"));

        //Print all pair in addressBook
        Arrays.stream(addressBook.getAddressBooks()).toList().forEach(System.out::println);

        //Sorted addressBook by distinct and print all pair
        addressBook.sortedBy(SortedOrder.DESC);
        Arrays.stream(addressBook.getAddressBooks()).toList().forEach(System.out::println);

        //Created new Person to addressBook and checked size addressBook and print all pair
        addressBook.create("Tom", "Stevens", "Address #5");
        System.out.println("Size addressBooks: " + addressBook.size());
        Arrays.stream(addressBook.getAddressBooks()).toList().forEach(System.out::println);

        //Checked how work delete method and print status and print all pair
        boolean deleteStatus = addressBook.delete("John", "Brown");
        System.out.println("Delete status: " + deleteStatus);
        Arrays.stream(addressBook.getAddressBooks()).toList().forEach(System.out::println);


    }
}
