package oop.tooop;

abstract class AbstractIncome {
    protected double income;
    public AbstractIncome (double income) {
        this.income = income;
    }
    public abstract double getTax ();
}

class AbstractSalary extends AbstractIncome {
    public AbstractSalary (double income) {
        super(income);
    }
    @Override
    public double getTax() {
       if (this.income > 5000) {
           return (this.income - 5000) * 0.2;
       } else {
           return this.income * 0.1;
       }
    }
}

class AbstractStateCouncilSpecialAllowance extends AbstractIncome {
    public AbstractStateCouncilSpecialAllowance (double income) {
        super(income);
    }
    @Override
    public double getTax() {
        return 0;
    }
}

