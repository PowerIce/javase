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
只要方法声明的Checked Exception 不在调用层被捕获也需要到更高的调用层被捕获  如果都不捕获 也会在main中被捕获
也可以把throw写到main上  main(String[] args) throws Exception {
所有异常都可以调用printStackTrace()方法打印异常栈
```
#### 多catch语句
```
多catch语句一定要先把子类写到前面  以为超类中包含子类 所以遇见超类就走超类的catch 子类的catch就永远到达不了
finally是无论前面有多少个catch无论是否异常 处理完都要到finally中执行finally块中的语句 可有可无 看情况而定
如果方法生命抛出了异常 补货里面可以不写catch语句结构
如果异常捕获是相同的功能可以这么写 catch (IOException | NumberFormatException e)
异常在catch() 中捕获   但是抛出可以不一定是捕获的异常也可以抛出别的异常
例如 catch (NullPointerException e) {
         throw new IllegalArgumentException();
     }

```