package oop.tooop.testinner;

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer("liuyun");
        Outer.Inner inner = o.new Inner();
        o.asyncHello();
        inner.run();
    }
}
