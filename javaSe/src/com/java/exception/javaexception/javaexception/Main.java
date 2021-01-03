package com.java.exception.javaexception.javaexception;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK(String s) {
        // 用指定编码转换String为byte[]:
        try{
            return s.getBytes("GBK");
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
