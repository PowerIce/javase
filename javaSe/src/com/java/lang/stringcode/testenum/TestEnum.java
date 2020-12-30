package com.java.lang.stringcode.testenum;

public class TestEnum {
    public void enumEquls () {
//        if (1 == Weekday.) {}
        System.out.println(Weekday.SAT.name());
        System.out.println(Weekday.SAT.ordinal());
        Weekday st = Weekday.TUE;
        if (st.intVal == 0 || st.intVal == 6) {
            System.out.println("home");
        } else {
            System.out.println("office");
        }
    }
}
enum Weekday {
    SUN(0), MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6);
    public final int intVal;
    private Weekday (int weekVal) {
        this.intVal = weekVal;
    }
}