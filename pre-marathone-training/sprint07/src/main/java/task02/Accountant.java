package task02;

import task01.ParallelCalculator;

public class Accountant {
    static void sum(int i1, int i2) {
        new Thread(new ParallelCalculator(Integer::sum, i1, i2)).start();
    }
}
