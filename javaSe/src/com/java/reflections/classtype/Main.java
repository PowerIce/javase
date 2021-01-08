package com.java.reflections.classtype;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String s = "中国";
        Class cla = s.getClass();

        Class cls = String.class;

        Class cls2 = Class.forName("java.lang.String");
//        String scls = (String) cls.getInterfaces();
    }
}
