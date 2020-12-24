> ### 面向对象基础2
#### 多态
```
子类中有与父类的同名方法被称为复写(Override)  子类要加@Override 来表示改方法复写
复写的条件是方法名 参数返回值类型都相同
Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
```
#### 覆写Object方法
```
覆写toString方法
@Override
public String toString() {
    return "Person:name=" + name;
}
```
#### 调用super
```
如果子类覆写了父类方法之后想调用父类方法 可以使用super() 例如 super.run();
```
#### 不允许覆写
```
方法加入final就可以禁止子类的覆写
public final String hello() {
    return "Hello, " + name;
}
如果类使用final 则没有类可以继承 例如 final class Person{}
字段使用final则不能被修改
```