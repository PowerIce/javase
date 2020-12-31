package com.java.oop.tooop.testabstract;

abstract class AbstractPerson {
    public abstract void run ();
}

class AbstractStudent extends AbstractPerson {
    @Override
    public void run () {
        System.out.println("抽象方法覆写");
    }
}
