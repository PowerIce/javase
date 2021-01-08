package com.java.reflections.assesfiled;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Class std = Student.class;
        System.out.println(std.getField("score"));
        System.out.println(std.getField("name"));
        System.out.println(std.getFields().toString());
        System.out.println(std.getDeclaredField("grade"));
        System.out.println(std.getDeclaredFields());
    }
}
class Student extends Person {
    public int score;
    private int grade;
}
class Person {
    public String name;
}
