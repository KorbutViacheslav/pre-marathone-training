package task01;

import java.util.function.BinaryOperator;

public class ParallelCalculator implements Runnable {
    BinaryOperator<Integer> binaryOperator = Integer::sum;
    int operand1;
    int operand2;
    double result;

    public ParallelCalculator(BinaryOperator<Integer> binaryOperator, int operand1, int operand2) {
        this.binaryOperator = binaryOperator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void run() {
        binaryOperator.apply(operand1, operand2);
    }
}
