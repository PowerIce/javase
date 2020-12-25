package oop.tooop;

class Income {
    protected double income;
    public Income (double income) {
        this.income = income;
    }
    public double getTax () {
        return this.income * 0.1;
    }
}
class Salary extends Income {
    public Salary (double income) {
        super(income);
    }
    @Override
    public double getTax() {
        return (this.income - 5000) * 0.1;
    }
}
class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance (double income) {
        super(income);
    }
    @Override
    public double getTax() {
        return this.income * 0;
    }
}
