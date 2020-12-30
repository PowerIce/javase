package com.java.lang.stringcode.teststring;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TestString {
    public String s = "hello";
    public String s2 = "HE LLO";
    public void compare () {
        System.out.println(s == s2);
        System.out.println(s.equals(s2.toLowerCase()));
        System.out.println(s.contains("he"));
        System.out.println(s.indexOf("l"));
        System.out.println(s.lastIndexOf("l"));
        System.out.println(s.startsWith("he"));
        System.out.println(s.endsWith("lo"));
        System.out.println(s2.substring(2));
        System.out.println(s2.substring(2, 4));
        System.out.println(s2.trim());
        System.out.println(s2.strip());
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());
        System.out.println(s2.replace("L", "6"));
        String s3 = "A,B,C,D";
        System.out.println(s3.replaceAll("[\\,\\:\\s]+", ","));
        String [] ss = s3.split("\\,");
        System.out.println(ss);
        String sjoin = String.join("***", ss);
        System.out.println(sjoin);
//        String s4 = "Hi %s, your score is %d!";
//        System.out.print(s4.formatted("Alice", 80) + "\t");
        System.out.print(String.format("Hi %s, your score is %.2f!", "Bob", 59.5) + "\t");
        System.out.print(String.valueOf(123) + "\t"); // "123"
        System.out.print(String.valueOf(45.67) + "\t"); // "45.67"
        System.out.print(String.valueOf(true) + "\t"); // "true"
        System.out.println(String.valueOf(new Object()) + "\t");// 类似java.lang.Object@636be97c

        // 数值转换
        System.out.print(Integer.parseInt("123") + "\t");
        System.out.println(Integer.parseInt("ff", 16) + "\t");
        // 布尔转换
        System.out.print(Boolean.parseBoolean("true"));
        System.out.print(Boolean.parseBoolean("FALSE"));
        System.out.print(Integer.getInteger("java.version"));
        // 转换为char[]
        char[] cs = "Hello".toCharArray();
        String schar = new String(cs);
        System.out.println(schar);
        cs[0] = 'X';
        System.out.println(schar);
        int [] score = new int[] {88, 77, 52, 66};
        Score sc = new Score(score);
        sc.printScore();
        score[2] = 11;
        sc.printScore();


        byte[] b1 = "Hello".getBytes(); // 按系统默认编码转换，不推荐
//        byte[] b2 = "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
//        byte[] b3 = "Hello".getBytes("GBK"); // 按GBK编码转换
        byte[] b4 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换
//        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);

    }
}
class Score {
    public int[] score;
    public Score (int[] score) {
        this.score = score.clone();
    }

    public void printScore () {
        System.out.println(Arrays.toString(score));
    }
}
