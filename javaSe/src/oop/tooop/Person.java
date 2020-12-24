package oop.tooop;

class Person {
    protected String name;
    protected int age;
    public Person () {
    }
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setName (String name1, String name2) {
        this.name = name1 + "和" + name2;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class Student extends Person {
    protected int score;
    public Student (String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
}
//public sealed class Student extends Person permits Gang, Hong, Ming {
//    protected int score;
//    public Student (String name, int age, int score) {
//        super(name, age);
//        this.score = score;
//    }
//}
//public final class Gang extends Student {
//
//}
