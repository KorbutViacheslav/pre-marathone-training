package task04;

import java.math.BigDecimal;

public class Manager extends Employee {
    private double coefficient;

    public Manager(String name, int experience, BigDecimal basePayment, double coefficient) {
        super(name, experience, basePayment);
        this.coefficient = coefficient;
    }

    @Override
    public BigDecimal getBasePayment() {
        return super.getBasePayment().multiply(BigDecimal.valueOf(coefficient));
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return "Manager{" + getName() +
                ", experience=" + getExperience() +
                ", basePayment=" + getBasePayment() +
                ", coefficient=" + coefficient +
                '}';
    }
}
