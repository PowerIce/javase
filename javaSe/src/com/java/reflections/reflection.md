> ### 反射
#### Class类
```
除了int等基本类型之外  其他全部都是class
通过class 获取class信息的方法为反射
Class 比较 用 == 和 instanceof的区别
==比较可以精确判断出数据的类型  不做子类比较
instanceof 比较 可以判断数据类型   但也会判断其包含的子类  
通常情况下 应该用instanceof    只有具体到某个类型的时候才用==比较
static void printClassInfo(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
    }
Class name: java.lang.String
Simple name: String
Package name: java.lang
is interface: false
is enum: false
is array: false
is primitive: false
Class name: java.lang.Runnable
Simple name: Runnable
Package name: java.lang
is interface: true
is enum: false
is array: false
is primitive: false
```
#### 访问字段
```
Field getField(name)：根据字段名获取某个public的field（包括父类）
Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
Field[] getFields()：获取所有public的field（包括父类）
Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）
```
