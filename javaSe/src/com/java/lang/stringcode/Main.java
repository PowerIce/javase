package com.java.lang.stringcode;

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
    }
}
