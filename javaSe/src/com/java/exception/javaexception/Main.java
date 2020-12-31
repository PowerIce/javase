package com.java.exception.javaexception;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte [] bs = toGbk("中文");
        System.out.println(Arrays.toString(bs));
    }
    static byte[]  toGbk(String s) {
        try {
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            System.out.println(e);
            return s.getBytes();
        }
//        return s.getBytes("GBK"); // java: 未报告的异常错误java.io.UnsupportedEncodingException; 必须对其进行捕获或声明以便抛出
    }
}
