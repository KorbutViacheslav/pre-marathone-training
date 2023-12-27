package task01;

import java.util.List;

public class MainS7T1 {
    public static void main(String[] args) {

        //Created new ParallelCalculator and set parameters BinaryOperator and 2 operands.
        ParallelCalculator pC1 = new ParallelCalculator(Integer::sum, 6, 2);
        ParallelCalculator pC2 = new ParallelCalculator((o1, o2) -> o1 - o2, 6, 2);
        ParallelCalculator pC3 = new ParallelCalculator((o1, o2) -> o1 * o2, 6, 2);
        ParallelCalculator pC4 = new ParallelCalculator((o1, o2) -> o1 / o2, 6, 2);

        //Added all ParallelCalculator to list of Threads and transmit to.
        List<Thread> threadList = List.of(new Thread(pC1), new Thread(pC2), new Thread(pC3), new Thread(pC4));

        //Called method start from all thread.
        threadList.forEach(Thread::start);

    }
}
