package com.java.reflections.testproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Student ordinaryStudent = new SoStudent();
        ordinaryStudent.eat();
        ordinaryStudent.run();
        ordinaryStudent.write();

        InvocationHandler handler = (proxy, method, handlerArgs) -> {
          if ("eat".equals(method.getName())) {
              System.out.println("吃饭：四菜一汤");
              return null;
          }
          if ("write".equals(method.getName())) {
              System.out.println("我的作业600字");
              method.invoke(ordinaryStudent, handlerArgs);
              System.out.println("我拿了一等奖");
              return null;
          }
          return null;
        };
        Student sonOfDistrict = (Student) Proxy.newProxyInstance(ordinaryStudent.getClass().getClassLoader(), ordinaryStudent.getClass().getInterfaces(), handler);
        sonOfDistrict.eat();
        sonOfDistrict.write();
    }
}

interface Student {
    void eat();
    void run();
    void write();
}
class SoStudent implements Student{
    @Override
    public void eat() {
        System.out.println("我在吃饭：简餐");
    }
    @Override
    public void run() {
        System.out.println("我在跑步：10圈");
    }
    @Override
    public void write() {
        System.out.println("我在写作业：800字");
    }
}
