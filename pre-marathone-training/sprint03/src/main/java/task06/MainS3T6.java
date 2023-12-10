package task06;

import java.util.Arrays;

public class MainS3T6 {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook(3);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("Steven", "Taylor", "Address #1");
        boolean updateStatus = addressBook.update("Steven", "Taylor", "Address #3");
        System.out.println("Update status: " + updateStatus);
        System.out.println(addressBook.read("Steven", "Taylor"));
        Arrays.stream(addressBook.getAddressBooks()).toList().forEach(System.out::println);
        addressBook.sortedBy(SortedOrder.DESC);
        Arrays.stream(addressBook.getAddressBooks()).toList().forEach(System.out::println);
        addressBook.create("Tom", "Stevens", "Address #5");
        System.out.println("Size addressBooks: "+addressBook.size());
        Arrays.stream(addressBook.getAddressBooks()).toList().forEach(System.out::println);
        boolean deleteStatus = addressBook.delete("John", "Brown");
        System.out.println("Delete status: " + deleteStatus);
        Arrays.stream(addressBook.getAddressBooks()).toList().forEach(System.out::println);


    }
}
