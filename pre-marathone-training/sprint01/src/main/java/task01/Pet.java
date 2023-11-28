package task01;

public class Pet {
    public String name;
    public int age;
}

class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.name = "Lucky";
        pet.age = 2;
        System.out.println(pet);
    }
}