> ### 异常处理
#### Java异常
```
Throwable 是异常体系的根  分为两种 Error、Exception ；
Error表示严重错误 是系统层面 程序无法解决
例如：OutOfMemoryError：内存耗尽
     NoClassDefFoundError：无法加载某个Class
     StackOverflowError：栈溢出
Exception是运行错误 可以捕获处理
例如：NumberFormatException：数值类型的格式错误
     FileNotFoundException：未找到文件
     SocketException：读取网络失败
还有一些异常是程序逻辑编写不对造成的，应该修复程序本身。
例如：NullPointerException：对某个null的对象调用方法或字段
     IndexOutOfBoundsException：数组索引越界
```