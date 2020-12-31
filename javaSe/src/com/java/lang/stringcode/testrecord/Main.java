package com.java.lang.stringcode.testrecord;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(123, 456);
        System.out.println(p.x());
        System.out.println(p.y());
        System.out.println(p);
        System.out.println(p.of(11,52));
    }
}
record Point (int x, int y) {
    public static Point of () {
        return new Point(0, 0);
    }
    public static Point of (int x, int y) {
        return new Point(x, y);
    }
}
