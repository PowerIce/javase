package com.java.oop.tooop.testdefault;

interface DefaultIncome {
    double getTax();
}

class DefaultSalary implements DefaultIncome {
    private double income;
    public DefaultSalary (double income) {
        this.income = income;
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

class DefaultStateCouncilSpecialAllowance implements DefaultIncome {
    private double stateCountIncome;
    public DefaultStateCouncilSpecialAllowance (double stateCountIncome) {
        this.stateCountIncome = stateCountIncome;
    }
    @Override
    public double getTax() {
        return 0;
    }
}

