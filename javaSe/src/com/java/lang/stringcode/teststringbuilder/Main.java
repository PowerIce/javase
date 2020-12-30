package com.java.lang.stringcode.teststringbuilder;

public class Main {
    public static void main(String[] args) {
//        TestString ts = new TestString();
//        ts.compare();
        TestStringBuilder sb = new TestStringBuilder();
        sb.addString();

        Adder a = new Adder();
        a.add(1).add(3).inc().add(5);
        System.out.println(a.value());

        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        AdderJoin aj = new AdderJoin();
        String select = aj.buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");

        //进制装换
        int x1 = Integer.parseInt("100");
        int x2 = Integer.parseInt("100", 16);
        int x3 = Integer.parseInt("100", 8);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        Number num = new Integer(999);
        // 获取byte, int, long, float, double:
        byte b = num.byteValue();
        int n = num.intValue();
        long ln = num.longValue();
        float f = num.floatValue();
        double d = num.doubleValue();
        System.out.print(b + "\t");
        System.out.print(n + "\t");
        System.out.print(ln + "\t");
        System.out.print(f + "\t");
        System.out.print(d + "\t");
    }
}
