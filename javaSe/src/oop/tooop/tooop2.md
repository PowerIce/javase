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
#### 抽象类
```
abstract
可以定义抽象方法和抽象类
如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，那么，可以把父类的方法声明为抽象方法：
class Person {
    public abstract void run();
}
抽象方法必须有抽象类 abstract class ...
抽象类无法被实例化 只能被继承 继承的子类要必须覆写父抽象类的抽象方法
```
#### 面向抽象编程
```
高层次的类只需要定义抽象类和方法 不需要执行任何操作  具体的操作由子类去覆写完成执行
```
#### 接口
``` 
如果抽象类中没有字段 全部是抽象方法  就可以把该抽象类改成接口 ： interface
例如： abstract class Person {
          public abstract void run();
          public abstract String getName();
      }
      interface Person {
          void run();
          String getName();
      }
```