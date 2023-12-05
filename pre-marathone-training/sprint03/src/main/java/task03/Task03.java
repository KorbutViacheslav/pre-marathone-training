package task03;

public class Task03 {
    public static void main(String[] args) {
        addition(5, 5);
    }

    public static void execute(int a, int b, Strategy strategy) {
        double result = strategy.doOperation(a, b);
        String nameStrategy = strategy.getClass().getDeclaredMethods()[0].getName();
        System.out.println(nameStrategy + ": " + result);
    }

    public static void addition(int a, int b) {
        execute(a, b, new Strategy() {
            @Override
            public double doOperation(int a, int b) {
                return a + b;
            }
        });
    }
}
