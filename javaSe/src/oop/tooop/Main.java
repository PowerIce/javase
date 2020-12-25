package oop.tooop;

public class Main {
    public static void main(String[] args) {
//        Person p = new Person("丽丽", 19);
//        Person p2 = new Person();
//        p2.setName("丽丽");
//        System.out.println(p2.getName());
//        p2.setName("丽丽", "花花");
//        System.out.println(p2.getName());
//        City bj = new City();
//        bj.setName("小明");
//        System.out.println(bj.getName());
//        Student s = new Student("kobe", 28, 81);
//        Object obj = "hello";
//        if (obj instanceof String str) {
//            // 可以直接使用变量s:
//            System.out.println(str.toUpperCase());
//        }
//        // 税收
//        Income[] incomes = new Income[] {
//                new Income(5000),
//                new Salary(8000),
//                new StateCouncilSpecialAllowance(15000)
//        };
//        System.out.println(totalTax(incomes));
        // abstract
//        AbstractPerson s = new AbstractStudent();
//        s.run();
        // interface
        InterfacePerson s = new InterfaceStudent("Bing");
        s.run();
        s.getName();
    }
//    public static double totalTax(Income... incomes) {
//        double d = 0;
//        for (Income inc : incomes) {
//            d += inc.getTax();
//        }
//        return d;
//    }

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
