package com.java.oop.tooop.testinterface;

interface InterfacePerson {
    void run();
    String getName();
}

class InterfaceStudent implements InterfacePerson {
    private String name;
    public InterfaceStudent (String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(this.name + "Student Run");
    }

    @Override
    public String getName() {
        return name;
    }
}
