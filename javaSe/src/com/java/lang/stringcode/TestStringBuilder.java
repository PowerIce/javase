package com.java.lang.stringcode;

import java.util.StringJoiner;

public class TestStringBuilder {
    public StringBuilder s = new StringBuilder(1024);
    public void addString () {
        for (int i = 0; i < 100; i++) {
            s.append("this ")
             .append(i)
             .append(",");
        }
        System.out.println(s);
    }

}

class Adder {
    private int sum = 0;
     public Adder add (int n) { // Adder 代表返回自己
         sum += n;
         return this; // 返回自己
     }

     public  Adder inc () {
         sum++;
         return this;
     }
     public  int value () {
         return this.sum;
     }
}
class AdderJoin {
    private static String s1;
    public static String buildSelectSql (String table, String[] fields) {
        s1 = String.join(", ", fields);
        return "SELECT " + s1 + " FROM " + table;
    }
}


