package task01;

import java.util.function.BinaryOperator;

public class ParallelCalculator implements Runnable {
    private final BinaryOperator<Integer> binaryOperator;
    private final int operand1;
    private final int operand2;
    public double result;

    public ParallelCalculator(BinaryOperator<Integer> binaryOperator, int operand1, int operand2) {
        this.binaryOperator = binaryOperator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void run() {
        System.out.println(result = binaryOperator.apply(operand1, operand2));

    }
}
