# Task06: Little app (All sprint patterns and concepts)

---
Create class hierarchy that represent **Address Book**, where can be save records in format: **"(first name, last name) => address"**:

1. Records in the **Addres Book** should be represented as objects of the **NameAddressPair** type.
2. The pair **"(first name, last name)"** is key for access to **"address"** in the **Address Book**.
3. The key **"(first name, last name)"** should be immuteble and in **Address Book** cannot be two records with same key.
4. The capacity of **Address Book** must grow twice when has no place for save the next record.
5. The **sortedBy(...)** method should sorted records by ascending or descending using for this **Arrays.sort(...)** method.
6. The **Comparator** should be implemented as an anonymous class.
7. Sorting at first be by **firstName** field, and if the names match then by **lastName** field.
8. The **next()** method from **AddressBookIterator** class should return record as **String** in next format:
   _"First name: <first name>, Last name: <last name>, Address: <address>"_
9. Records in the **Address Book** must be ordered according to date of creation.

A class hierarchy should be correspond the next class diagram:

![image](https://github.com/KorbutViacheslav/pre-marathone-training/blob/main/pre-marathone-training/sprint03/screenshots-tasks-s3/task06sprint03.png?raw=true)

The next graphic notation means, that B is inner class and A is outer class:
> ## B &nbsp;&mdash;&mdash;⊕ A

> If you see the next error: _uses unchecked or unsafe operations_, just put the next code line **@SuppressWarnings("unchecked")** over **AddressBook** and **AddressBookIterator** classes.

> For correct passing of all tests don't use print and println methods in your code.


