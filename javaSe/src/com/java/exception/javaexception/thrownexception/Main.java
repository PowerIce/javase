package com.java.exception.javaexception.thrownexception;

public class Main {
    public static void main(String[] args) {
        try {
            process1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void process1 (){
        try {
            process2();
        }catch (NullPointerException e) {
            throw new IllegalArgumentException();
        }
    }
    static void process2(){
       throw new IllegalArgumentException();
    }
}
