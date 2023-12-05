package task03;

public class Task03 {
    public static void main(String[] args) {
        addition(5, 5);
        subtraction(5, 2);
        multiplication(2, 3);
        division(10, 2);
    }

    public static void execute(int a, int b, Strategy strategy) {
        double result = strategy.doOperation(a, b);
        System.out.println(result);
    }

    public static void addition(int a, int b) {
        execute(a, b, new Strategy() {
            @Override
            public double doOperation(int a, int b) {
                return a + b;
            }
        });
    }

    public static void subtraction(int a, int b) {
        execute(a, b, new Strategy() {
            @Override
            public double doOperation(int a, int b) {
                return a - b;
            }
        });
    }

    public static void multiplication(int a, int b) {
        execute(a, b, new Strategy() {
            @Override
            public double doOperation(int a, int b) {
                return a * b;
            }
        });
    }

    public static void division(int a, int b) {
        execute(a, b, new Strategy() {
            @Override
            public double doOperation(int a, int b) {
                if (b == 0) {
                    throw new ArithmeticException("It`s not possible to divide by zero.");
                }
                return a / b;
            }
        });
    }
}
