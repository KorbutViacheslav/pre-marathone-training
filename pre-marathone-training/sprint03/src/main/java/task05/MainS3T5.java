package task05;

public class MainS3T5 {
    public static void main(String[] args) {
        for (ClientType cT : ClientType.values()) {
            System.out.println(cT + ": " + cT.discount());
        }
    }
}
