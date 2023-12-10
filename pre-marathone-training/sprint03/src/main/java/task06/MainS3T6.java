package task06;

import java.util.Arrays;

public class MainS3T6 {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook(3);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("Steven", "Taylor", "Address #1");
        boolean status = addressBook.update("Steven", "Taylor", "Address #3");
        System.out.println(status);
        System.out.println(addressBook.read("Steven", "Taylor"));
        Arrays.stream(addressBook.getAddressBooks()).toList().forEach(System.out::println);
        addressBook.sortedBy(SortedOrder.DESC);
        Arrays.stream(addressBook.getAddressBooks()).toList().forEach(System.out::println);
        addressBook.create("Tom", "Stevens", "Address #5");
        System.out.println(addressBook.size());
        Arrays.stream(addressBook.getAddressBooks()).toList().forEach(System.out::println);
        addressBook.delete("John", "Brown");
        Arrays.stream(addressBook.getAddressBooks()).toList().forEach(System.out::println);


    }
}
