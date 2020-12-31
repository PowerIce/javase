> ###JAVA核心类
#### String
```
相同string变量对比是相等的   string经过修饰 之后一致 用equals是相等的  ===得出是不等的
因此 字符串比较必须使用equals方法  忽略大小写对比使用   equalsIgnoreCase()  
formatted 替换相对应的占位符 
  例如 
     String s = "Hi %s, your score is %d!";
    
     System.out.println(s.formatted("Alice", 80));
format 与formatted 相似 
  例如  String.format("Hi %s, your score is %.2f!", "Bob", 59.5)
占位符   %s：显示字符串；%d：显示整数；%x：显示十六进制整数；%f：显示浮点数。
参考[jdk14] (https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Formatter.html#syntax)
类型转换 valueof
转char[] 不会直接引用传入对象     而是复制一份  所以修改原来的String并不会影响内部char[]数组
```
#### 字符编码
```
byte[] b1 = "Hello".getBytes(); // 按系统默认编码转换，不推荐
byte[] b2 = "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
byte[] b2 = "Hello".getBytes("GBK"); // 按GBK编码转换
byte[] b3 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换
```
#### StringBuilder
```
虽然可以直接拼接字符串，但是，在循环中，每次循环都会创建新的字符串对象，然后扔掉旧的字符串。这样，绝大部分字符串都是临时对象，不但浪费内存，还会影响GC效率。
是一个可变对象  可以预配缓冲区  网StringBuilder中新增字符串不会创建临时对象
```
#### StringJoiner
```
与 StringBuilder 相似 可以指定开头与结尾
String[] names = {"Bob", "Alice", "Grace"};
        var sj = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            sj.add(name);
        }
```
#### String.join()
```
静态方法 
再不需要指定开头和结尾时使用
String[] names = {"Bob", "Alice", "Grace"};
var s = String.join(", ", names);
```
#### 包装类型
```
引用类型可以赋值为null  基本类型无法赋值为null
引用类型比较不能使用== 必须使用equals()

进制转换
    System.out.println(Integer.toString(100)); // "100",表示为10进制
    System.out.println(Integer.toString(100, 36)); // "2s",表示为36进制
    System.out.println(Integer.toHexString(100)); // "64",表示为16进制
    System.out.println(Integer.toOctalString(100)); // "144",表示为8进制
    System.out.println(Integer.toBinaryString(100)); // "1100100",表示为2进制
处理无符号整形  无符号整型就看作是从零开始
    byte x = -1;
    byte y = 127;
    System.out.println(Byte.toUnsignedInt(x)); // 255
    System.out.println(Byte.toUnsignedInt(y)); // 127
```
#### JavaBean
```
使用Introspector.getBeanInfo()可以获取属性列表。
可以枚举javaBean的所有信息
BeanInfo info = Introspector.getBeanInfo(Person.class);
for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
    System.out.println(pd.getName());
    System.out.println("  " + pd.getReadMethod());
    System.out.println("  " + pd.getWriteMethod());
}
```
#### 枚举类 enum
```
enum 用来枚举常量 例如
enum Weekday {SUN, MON, TUE, WED, THU, FRI, SAT;}
enum本身带有类型信息  不同类与enum进行==比较 都会报出类型错误
例如 if(1 == Weekday.SUN)
不同类型的枚举类不能相互赋值和比较 因为类型不同
返回常量名 Weekday.SUN.name(); 此方法不能被覆写
返回常量顺序 Weekday.SUN.ordinal();
```
#### BigInteger
```
可以模拟很大的整数  不会有限制   但是速度较慢
可以转换成各种Number类型 
例如 longValue() longValueExact();
```
#### BigDecimal
```
可以表示一个任意大小且精度准确的浮点数 
可以用scale()表示小数位  例如 new BigDecimal("15.245").scale() // 3
stripTrailingZeros() 去掉末尾的0 例如 12.300 转化为 12.3
如果scale()返回负数 则表示这个数是整数 且 末尾有两个0
对BigDecimal做加、减、乘 精度不会丢失   但是除法存在除不尽的情况 所以就要保留小数了
divideAndRemainder() 做除法冰求出余数 会返回一个长度为2 的数组 一个是商  一个是余数
BigDecimal 比较使用equals  但是要求数值相等和scale()都相等  // 12.3 与 12.300使用equals是不等的因为scale() 不相等
必须使用comparTo() 会更具两个值大小返回负数 、0、和正数 分别表示 小于等于和大于
```