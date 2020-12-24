> ### 面向对象基础
```
类 Class  即 电脑
实例 instance 即 各个品牌的电脑
```
#### 修饰符
```
private 私有化    外部不能直接访问
```
#### 方法
```
为了是外界的类对本类私有的字段进行获取和赋值 就要使用相对应的get set方法
get方法 用来返回对应field   set方法用来对对应field进行赋值

private方法 不允许外界调用该方法  但是内部其他方法可以调用该方法
例如 
public int getAge() {
    return calcAge(2019); // 调用private方法
}

// private方法:
private int calcAge(int currentYear) {
    return currentYear - this.birth;
}
```
#### 方法参数
```
getName (String name) //只能传入一个参数
getName (String name， String name2) //只能传入二个参数
getName (String... name) //能传入n个参数
方法参数类型要保持一致
基本类型参数 变量重新赋值不会影响已经调用的地方
引用类型参数 在数组结构时修改任意数组元素会相互影响对方
```
#### 构造方法
```
解决初始化赋值的问题
比如 
new Person(String name, 15)
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

可以定义多个构造方法  用来初始化不同的参数的实例

构造方法使用 this() 即调用性对应的方法
```
#### 方法重载
```
相同的方法名 入参和功能不同即是方法重载
例如
public void setName(String name) {
    this.name = name;
}
public void setName(String name1, String name2) {
    this.name = name1 + "和" + name2;
}
```
#### 继承
```
extends  
以student为例 继承关系 Object <--- Person <--- Student
protected 子类无法访问父类的private修饰符  父类使用protected就可以进行访问
super 超类  有继承的情况下使用super和this都能访问到父类
子类构造方法会自动调用父类的无参构造方法 如果父类没有默认的构造方法则显式调用super(...args) 
```
#### 阻止继承
```
从Java 15开始，允许使用sealed修饰class，并通过permits明确写出能够从该class继承的子类名称
例如  public sealed class Shape permits Rect, Circle, Triangle
sealed 表示此类是指定继承的  permits 表示能被继承的类有哪些
```
#### 向上/下转型
```
向上 Person s = new Student() Object o = s
向下 无法转化实际类型比转化类型高的类  比如 Person p = new Person(); Student s = (Student)p;
向下转型可以先用instanceof看一下实际类型是否相等 
```