package oop.tooop;

public class Main {
    public static void main(String[] args) {
        City bj = new City();
        bj.setName("小明");
        System.out.println(bj.getName());
    }
}

class City {
    private String name;
    private double latitude;
    private double longitude;
    public void setName(String name) {
        this.name = name;
    }
    public String getName () {
        return this.processName();
    }
    private String processName () {
        return "名字: " + this.name;
    }
}
