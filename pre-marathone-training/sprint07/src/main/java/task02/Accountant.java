package task02;

import task01.ParallelCalculator;

public class Accountant {
    static double sum(int i1, int i2) {
        ParallelCalculator parallelCalculator = new ParallelCalculator(Integer::sum, i1, i2);

        Thread thread = new Thread(parallelCalculator);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return parallelCalculator.result;
    }
}
