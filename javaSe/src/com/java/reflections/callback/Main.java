package com.java.reflections.callback;

public class Main {
    public static void main(String[] args) throws Exception {
        Class stdClass = Student.class;
        System.out.println(stdClass.getMethod("getScore", String.class));
        System.out.println(stdClass.getMethod("getName"));
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));
    }
}
class Student extends Person {
    public int getScore (String type) {
        return 99;
    }
    public int getGrade (int year) {
        return 1;
    }
}
class Person {
    public String getName () {
        return "person";
    }
}
