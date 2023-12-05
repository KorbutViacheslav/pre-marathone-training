package task02;

public class MainS3T2 {
    public static void main(String[] args) {
        NameList nameList = new NameList();
        NameList.NameIterator iterator = nameList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
