package task03;

public class MainS3T3 {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.execute(5, 5, new Addition());
        arithmetic.execute(3, 3, new Multiplication());
        arithmetic.execute(5, 1, new Subtraction());
        arithmetic.execute(10, 2, new Division());

    }

    static class Arithmetic {
        public void execute(int a, int b, Strategy strategy) {
            double result = strategy.doOperation(a, b);
            String nameStrategy = strategy.getClass().getName();
            System.out.println(nameStrategy + ": " + result);
        }
    }


    static class Addition implements Strategy {
        @Override
        public double doOperation(int a, int b) {
            return a + b;
        }
    }

    static class Subtraction implements Strategy {

        @Override
        public double doOperation(int a, int b) {
            return a - b;
        }
    }

    static class Multiplication implements Strategy {

        @Override
        public double doOperation(int a, int b) {
            return a * b;
        }
    }

    static class Division implements Strategy {

        @Override
        public double doOperation(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("It`s not possible to divide by zero.");
            }
            return a / b;
        }
    }
}
