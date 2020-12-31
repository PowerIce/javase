package com.java.lang.stringcode.bignumber;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigInteger bn = new BigInteger("451513512");
        System.out.println(bn.pow(5));
        System.out.println(bn.longValue());
        System.out.println(bn.multiply(bn).longValueExact());

        BigDecimal bd = new BigDecimal("12.354400");
        BigDecimal bd2 = new BigDecimal("12.3544");
        System.out.println(bd.scale());
        System.out.println(bd.stripTrailingZeros());

        System.out.println(bd.setScale(3, RoundingMode.DOWN)); // 四舍五入
        System.out.println(bd.setScale(2, RoundingMode.HALF_UP)); // 直接截断

        System.out.println(bd.equals(bd2));
        System.out.println(bd.compareTo(bd2));

    }
}
