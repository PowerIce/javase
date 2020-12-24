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
```