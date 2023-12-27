package task01;

public class MainS7T1 {
    public static void main(String[] args) {
        ParallelCalculator pC1 = new ParallelCalculator(Integer::sum,6,2);
        ParallelCalculator pC2 = new ParallelCalculator((o1,o2)->o1-o2,6,2);
        ParallelCalculator pC3 = new ParallelCalculator((o1,o2)->o1*o2,6,2);
        ParallelCalculator pC4 = new ParallelCalculator((o1,o2)->o1/o2,6,2);
        new Thread(pC1).start();
        new Thread(pC2).start();
        new Thread(pC3).start();
        new Thread(pC4).start();

    }
}
