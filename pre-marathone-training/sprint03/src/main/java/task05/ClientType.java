package task05;

public enum ClientType {
    NEW(1, 0),
    SILVER(12, 0.25),
    GOLD(30, 0.3),
    PLATINUM(60, 0.35);
    private final int month;
    private final double coefficient;

    ClientType(int month, double coefficient) {
        this.month = month;
        this.coefficient = coefficient;
    }

    public double discount() {
        return (100 - this.month * this.coefficient) / 100;
    }
}
