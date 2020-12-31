package com.java.oop.tooop.testdefault;

interface DefaultPerson {
    String getName();
    default void run () {
        System.out.println(getName() + "运行DefaultPerson Run方法");
    }
}

class DefaultStudent implements DefaultPerson {
    private String name;
    public DefaultStudent (String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
