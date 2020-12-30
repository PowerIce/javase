package oop.tooop.testinner;

public class Outer {
    private final String name;
    Outer (String name) {
        this.name = name;
    }
    class Inner {
        void run () {
            System.out.println("Inner,run" + Outer.this.name);
        }
    }
    void asyncHello() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable" + Outer.this.name);
            }
        };
        new Thread(r).start();
    }
}
