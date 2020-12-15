### JAVA

## 软件开发介绍
1. 软件开发
    >软件，即一系列按照特定顺序组织的计算机数据和指令的集合。有系统软件和应用软件之分。
2. 人机交互方式
    >图形化界面（Graphical User Interface GUI）这种方式简单直观，使用者易于接受，容易上手操作。
    命令行方式（Command Line Interface CLI）需要有一个控制台，输入特定的指令，让计算机完成一些操作。较为麻烦，需要记录住一些命令。
3. 常用的DOS命令
    >dir:列出当前目录下的文件以及文件夹
    >md：创建目录    
    >rd：删除目录    
    >cd：进入指定目录    
    >cd..：退回到上一级目录    
    >cd\：退回到根目录    
    >del：删除文件    
    >exit：退出dos命令行 
    >echo name:Tom.age=12>1.doc :将 name:Tom.age=12写入到1.doc文件中    
4. 常用快捷键
    >←→：移动光标        
    >↑↓：调阅历史操作命令        
    >delete和backspace：删除字符

## 计算机编程语言介绍
1. 什么是计算机语言
    > 语言：是人与人之间用于沟通的一种方式。例如：中国人和中国人用普通话沟通，而中国人和英国人交流，就要学习英语.
    > 计算机语言：人与计算机交流的方式
      如果人要与计算机交流，那么就要学习计算机语言。计算机语言有很多种。如：C,C++,JAVA,PHP,KOTLIN,Python,Scala等。        
* 第一代语言
    >机器语言：指令以二进制代码形式存在              
* 第二代语言
    >汇编语言：使用助记符表示一条机器指令
* 第三代语言
    高级语言：
     >C、Pascal、Fortran面向过程的语言         
     >C++面向过程/面向对象
     >Java跨平台的纯面向对象的语言
     >.NET跨语言的平台
     >Python、Scala....
 
https://www.tiobe.com/tiobe-index/  各计算机语言排行榜,每月都会更新

## Java语言概述
 >SUN公司1995年推出的一门高级编程语言，是一种面向Internet的编程语言。Java一开始富有吸引力是因为Java程序可以在
web浏览器中运行。这些Java程序被称为Java小程序（applet）。applet使用现代的图形用户界面与web用户进行交互。applet内嵌
在HTML代码中。随着Java技术在web方面的不断成熟，已经成为web应用程序的首选开发语言。

后台开发：Java、PHP、Python、Go、Node.js
          
java se 标注版：
支持桌面级应用（如windows下的应用程序）的Java平台，提供了完整的Java核心API，此版本以前称为J2SE
Java ee 企业版：
是为开发企业环境下的应用程序提供的一套解决方案。该技术体系中包含的技术如servlet、jsp等，主要针对于web应用程序开发，此版本以前称为J2EE
Java me  小型版
支持java程序运行在移动终端（手机、pda）上的平台，对Java api有所精简，并加入了针对于移动终端的支持，此版本以前称为J2ME
Java card
支持一些Java小程序（applets）运行在小内存设备（如智能卡）上的平台

## Java在各领域的应用：
从Java的应用领域来分，Java语言的应用方向主要表现在以下几个方面：
企业级应用：
主要指复杂的大企业的软件系统、各种类型的网站。Java的安全机制以及它的跨平台的优势，使它在分布式系统领域开发中有广泛应用，应用领域包括金融、电信、交通、电子商务等。
Android平台应用：
Android应用程序使用Java语言编写。Android开发水平的高低很大程度上取决于Java语言核心能力是否扎实。
大数据平台开发：
各类框架有Hadoop、spark、storm、flink等，就这类技术生态圈来讲，还有各种中间件如flume、Kafka、sqoop等等，这些框架以及工具大多数使用Java编写而成，但提供诸如Java、Scala、python、R等各种语言api提供编程
移动领域应用：
主要表现在消费和嵌入式领域，是指在各种小型设备上的应用，包括手机、pda、机顶盒、汽车通信设备等。


Java是一个纯粹的面向对象的程序设计语言。
Java舍弃了c语言中容易引起错误的指针，增加了垃圾回收器的功能。
          
## Java语言的特点：

* 面向对象：
两个基本概念：类、对象
三大特性：封装、多态、继承
* 健壮性：
吸收了c/c++语言的优点，但去掉了器影响程序健壮性的部分（如指针、内存的申请与释放等），提供了一个相对安全的内存管理和访问机制
* 跨平台性:
跨平台性：通过Java语言编写的应用程序在不同的系统平台上都可以运行。“Write once，Run Anywhere”
原理：只要在需要运行Java应用程序的操作系统上，先安装一个Java虚拟机（jvm Java Virtual Machine）即可，由JVM来负责Java程序在该系统中的运行。
          
## Java两种核心机制：
1、Java虚拟机（Java virtal machine）
JVM是一个虚拟的计算机，具有指令集并使用不同的存储区域，负责执行指令，管理数据、内存、寄存器。
对于不同的平台，有不同的虚拟机
只有某平添提供了对应的Java虚拟机，Java程序才可以在此平台上运行
Java虚拟机机制屏蔽了底层运行平台的差别，实现了“一次编译，到处运行”
2、垃圾收集机制（Garbage Collection） GC垃圾回收机制          
* 不再使用的内存空间应回收——垃圾回收
    * 在C/C++等语言中，由程序员负责回收无用内存。
    * Java语言消除了程序员回收无用内存空间的责任：它提供一种系统级线程跟踪存储空间的分配情况，并在JVM空闲时，检查并释放那些可被释放的存储空间。
* 垃圾回收在Java程序运行过程中自动进行，程序员无法精确控制和干预。

JDK Java开发工具包
JRE Java运行环境          

JDK、JRE、JVM三者之间的关系：
JDK=JRE+开发工具集（例如Javac编译工具等）
JRE=JVM+Java SE 标准库           
          
          
## 关键字和保留字
定义：被Java语言赋予了特殊含义，用作专门用途的字符串
特点：关键字中所有字母都为小写

* 用于定义数据类型的关键字：
    class interface enum byte short int long float double char boolean void
* 用于定义流程控制的关键字：
    if else swich case default while do for break continue return 
* 用于定义访问权限修饰符的关键字：
    private protected public
* 用于定义类，函数，变量修饰符的关键字：
    abstract final static synchronized
* 用于定义类与类之间关系的关键字：
    extends implements
* 用于定义建立实力及引用实例，判断实例的关键字：
    new this super instance of
* 用于异常处理的关键字:
    try catch finally throw throws
* 用于包的关键字：
    package import
* 其他修饰符关键字：
    native strictfp transient volatile assert
* 用于定义数据类型值得字面值：
    true false null          

保留字（reserved word）：现有Java版本尚未使用，但以后版本可能会作为关键字使用。自己命名标识符时要避免使用这些保留字。如：goto、const。

## 标识符（identifier）
  Java对各种变量、方法和类等要素命名时使用得字符序列称为标识符。
  技巧：凡是自己可以起名字得地方都叫标识符。
  
  定义合法标识符规则：
  * 由26个英文字母大小写、0-9、_或$组成
  * 数字不可以开头
  * 不可以使用关键字和保留字，但能包含关键字和保留字
  * Java中严格区分大小写，长度无限制
  * 标识符不能包含空格。        
          
 Java中的名称命名规范：
 * Java中的名称命名规范：
    * 包名：多单词组成时所有字母都小写：xxxyyyzzz
    * 类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz(大驼峰)
    * 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz（小驼峰）
    * 常量名：所有字母都大写，多单词时每个单词用下划线连接：XXX_YYY_ZZZ
 * 注意1：在起名字时，为了提高阅读性，要尽量有意义，”见名知意“
 * 注意2：Java采用Unicode字符集，因此标识符也可以使用汉字声明，但是不建议使用。            
          
## 变量
 * 变量的概念：
    * 内存中的一个存储区域
    * 该区域的数据可以在同一类型范围内不断变化
    * 变量是程序中最基本的存储单元。包含变量类型、变量名和存储的值
 * 变量的作用：
    * 用于在内存中保存数据
 * 使用变量注意：   
    * Java中每个变量必须先声明后使用
    * 使用变量名来访问这块区域的数据
    * 变量的作用域：其定义所在的一对{}内
    * 变量只有其作用域内才有效
    * 同一个作用域内，不能定义重名的变量        
   
 * Java定义变量的格式：数据类型 变量名=变量值;
          
 * 变量的分类--按数据类型：对于每一种数据都定义了明确的具体数据类型（强语言类型），在内存中分配了不同大小的内存空间
   > 数据类型 ：基本数据类型（数值型(整数类型（byte、short、int、long）、浮点类型（float、double）)、字符型(char)、布尔型(boolean)）、
   
   >引用数据类型（类(class)、接口(interface)、数组（[]））
            
 * 变量的分类--按声明的位置的不同
    * 在方法体外，类体内声明的变量称为成员变量
    * 在方法体内部声明的变量称为局部变量。
    
    > 成员变量（实例变量（不以static修饰）、类变量（以static修饰））
    
    > 局部变量（形参（方法、构造器中定义的变量）、方法局部变量（在方法内定义）、代码块局部变量（在代码块内定义））         
 
 * 注意：二者在初始化值方面的异同：
    同：都有生命周期
    异：局部变量除形参外，需显示初始化。
                             
          
## 基本数据类型转换
   * 自动类型转换：
   容量小的类型自动转换为容量大（范围大）的数据类型。数据类型按容量大小排序为：（char、byte、short）--->int--->long--->float--->double
        * 有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。
        * byte、short、char之间不会互相转换，他们三者再计算时首先转换成为int类型。
        * boolean类型不能与其它数据类型运算。
        * 当把任何基本数据类型的值和字符串（String）进行连接运算时（+），基本数据类型的值将自动转化为字符串（String）类型。
        
   * 强制类型转换：自动类型提升的逆运算
        * 需要使用强转符：（）
        * 注意点：强制类型转换，可能导致精度损失
        
   * String类型变量的使用：
        1、String属于引用数据类型，翻译为”字符串“
        2、声明String类型变量时，使用一对”“       
        3、String可以和8种基本数据类型变量做运算，且运算只能时连接运算（+）   
        4、运算的结果仍然时String类型  
          
## 进制与进制之间的转换
   * 所有数字在计算机底层都以二进制的形式存在
   * 对于整数，有四种表示方式：
        * 二进制：0、1，满二进一，以0b或0B开头
        * 十进制：0-9，满10进1
        * 八进制：0-7，满8进1，以数字0开头表示
        * 十六进制：0-9及A-F，满16进1，以0x或0X开头表示。此处的A-F不区分大小写。        
          
   * 二进制
        * Java整数常量默认是int类型，当用二进制定义整数时，其第32位是符号位。
        * 二进制的整数有如下三种形式
            1、原码：直接将一个数值转换成二进制数，最高位是符号位
            2、负数的反码：是对原码按位取反，只是最高位（符号位）确定为1.
            3、负数的补码：其反码加1
        * 计算机以二进制补码的形式保存所有的整数。
            1、正数的原码、反码、补码都相同
            2、负数的补码是其反码加1           
   *进制的基本转换
        * 十进制、二进制互转
            1、二进制转成十进制  乘以2的幂数
            2、十进制转成二进制  除以2取余数
        * 二进制、八进制互转
        * 二进制、十六进制互转 
        * 十进制、八进制互转
        * 十进制、十六进制互转          
## 运算符
   运算符是一种特殊的符号，用以表示数据的运算、赋值和比较等
   * 算术运算符
   * 赋值运算符
   * 比较运算符（关系运算符） 
   * 逻辑运算符
     * 相同点1：&和&&、|和||的运算结果相同
     * 相同点2：当符号左边是true时，&和&&都会执行符号右边的运算。当符号左边是false时，|和||都会执行符号右边的运算
     * 不同点：当符号左边是false时，&继续执行符号右边的运算。&&不再执行符号右边的运算。当符号左边是true时，|继续执行右边的运算，而||不再执行符号右边的运算。
     
   * 位运算符:<<--左移、>>--右移、>>>--无符号右移、&--与运算、|--或运算、^--异或运算、~取反运算   【了解】
     * 位运算是直接对整数的二进制进行的运算
     * 无<<<符号
     * “<<”空位补0，被移除的高位丢弃，空缺位补0；
     * “>>”被移位的二进制最高位是0，右移后，空缺位补0；
     * “>>>”被移位的二进制最高位无论是0或者是1，空缺位都用0补；
     * “&”二进制位进行&运算，只有1&1时结果为1，否则都是0；
     * “|”二进制位进行|运算，只有0|0时结果是0，否则是1；
     * “^”相同二进制位进行^运算，结果是0：1^1=0,0^0=0;不相同二进制位^运算结果是1：1^0=1,0^1=1;
     * “~”正数取反，各二进制码按补码各位取反；负数取反，各二进制码按补码各位取反
   * 三元运算符 ：（条件表达式）?表达式1：表达式2
     * 条件表达式为true，运算后的结果是表达式1；
     * 条件表达式为false，运算后的结果是表达式2；
     * 表达式1和表达式2为同种类型
     * 三元运算符与if-else的联系和区别
        * 三元运算符可简化if-else语句
        * 三元运算符要求必须返回一个结果
        * if后的代码块可有多个语句(可嵌套使用)
     * 凡是可以使用三元运算符的地方，都可以改写为if-else，反之，不成立。
     * 如果程序既可以使用三元运算符，又可以使用if-else结构，那么优先选择三元运算符。原因：简洁、执行效率高。
   * 运算符的优先级
     * 运算符有不同的优先级，所谓优先级就是表达式运算中的运算顺序
     * 只有单目运算符、三元运算符、赋值运算符是从右向左运算的。  
## 程序流程控制
    流程控制语句是用来控制程序中各语句执行顺序的语句，可以把语句组合成能完成一定功能的小逻辑块
   * 其流程控制方式采用结构化程序设计中规定的三种基本流程结构，即：
     * 顺序结构
        * 程序从上到下逐行的执行，中间没有任何判断和跳转
     * 分支结构
        * 根据条件，选择性的执行某段代码
        * 有if...else和swich-case两种分支语句。
     * 循环结构   
        * 根据循环条件，重复性的执行某段代码
        * 有while、do...while、for三种循环语句
        * 注：JDK 1.5提供了foreach循环，方便的遍历集合、数组元素。
   
   ### 分支结构
   
   * if-else结构
        * if（条件表达式）{执行代码块；}
        * if（条件表达式）{执行代码块1；}else{执行代码块2；}
        * if（条件表达式）{执行代码块1;}else if（条件表达式）{执行代码块2;}...else{执行代码块n;}  
   
    补充：随机数[a,b]生成公式:Math.random()*(b-a+1)+a     
           
   * swich-case结构
        * swich(表达式){case 常量1：语句1；break；case 常量2：语句2；break；...case 常量N：语句N；break；default：语句；break；}
        * 根据swich表达式中的常量，依次匹配各个case中的常量。一旦匹配成功，则进入相应case结构中，调用其执行语句。当调用完执行语句以后，则
          仍然继续向下执行其他case结构中的执行语句，直到遇到break关键字或此swich-case结构末尾结束为止。
        * break：可以使用在swich-case结构中，表示一旦执行到此关键字，就跳出swich-case结构 
        * swich结构中的表达式，只能是如下6中数据类型之一：byte、short、char、int、枚举类型（JDK 5.0新增）、String类型（JDK7.0新增）
        * case之后只能声明常量，不能声明范围。
        * break关键字是可选的。
        * default：相当于if-else结构中的else，default结构是可选的，位置是灵活的。
        * 如果swich-case结构中的多个case的执行语句相同，则可以考虑进行合并。
     
    说明：
    1、凡是可以使用swich-case的结构，都可以转换为if-else，反之，不成立
    2、写分支结构时，当发现既可以使用swich-case（同时，swich中表达式的取值情况不太多），又可以使用if-else时，
       我们优先选择使用swich-case.【原因：swich-case执行效率稍高】
         
              
   ### 循环结构       
   * 在某些条件满足的情况下，反复执行特定代码的功能
   * 循环语句的四个组成部分
   
        ① 初始化部分
        
        ② 循环条件部分 ---boolean类型
        
        ③ 循环体部分
        
        ④ 迭代部分
        
   * 循环语句分类
     * for循环
        * 结构：for(①；②；④){③}
        * 执行过程：①-②-③-④-②-③-④-...-②
     * while循环
        * 结构：① while（②）{③；④；}
        * 执行过程：①-②-③-④-②-③-④-...-②
     * do-while循环
        * 结构：①do{③；④；}while（②）；   
        * 执行过程：①-③-④-②-③-④-...-②   
     
     

            
         while循环说明：
              1、写while循环千万小心不要丢了迭代条件。一旦丢了，就可能导致死循环！
              2、我们写程序，要避免出现死循环 
              3、for循环和while循环是可以相互转换的 
         do-while循环说明：
              1、 do-while循环至少会执行一次循环体；
              2、开发中，使用for和while更多一些。较少使用do-while  
          
         1、不在循环条件部分限制次数的结构：for(;;)或while(true)
         2、结束循环的几种方式：
            方式一：循环条件部分返回false
            方式二：在循环体中，执行break
                 
### 嵌套循环       
 * 将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环
 * 外层循环：循环结构B
 * 内层循环：循环结构A  
    
    
    说明：
    1、内层循环结构遍历一遍，只相当于外层循环循环体执行了一次
    2、假设外层循环需要执行m次， 内层循环需要执行n次。此时内层循环的循环体一共执行了m*n次
    3、外层循环控制行数，内层循环控制列数  
                  
 ## break、continue
   * break
       * swich-case
       * 循环结构中
       * 结束当前循环
       * 关键字后面不能声明执行语句
       * 默认跳出包裹此关键字最近的一层循环
   * continue
       * 循环结构中
       * 结束当次循环 
       * 关键字后面不能声明执行语句
       * 默认跳出包裹此关键字最近的一层循环
  
 ## return
  * 并非专门用于结束循环的，它的功能是结束一个方法。当一个方法执行到return语句时，这个方法将被结束。
  * 与break和continue不同的是，return直接结束整个方法，不管这个return处于多少层循环之内。
    
 ## 数组
  * 是多个相同类型数据按一定顺序排列的组合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理。
  * 数组的常见概念
    * 数组名
    * 下表（或索引）
    * 元素
    * 数组的长度
  * 数组的特点： 数组是有序排列的 
  * 数组本身是引用数据类型，而数组中的元素可以是任何数据类型，包括基本数据类型和引用数据类型
  * 创建数组对象会在内存中开辟一整块连续的空间，而数组名中引用的是这块连续空间的首地址
  * 数组的长度一旦确定，就不能修改
  * 我们可以直接通过下标（或索引）的方式调用指定位置的元素，速度很快
  * 数组的分类
    * 按照维度：一维数组、二维数组、三维数组....
    * 按照元素的数据类型：基本数据类型元素的数组、引用数据类型元素的数组（即对象数组）
  
  * 一维数组的使用
    * 一维数组的声明和初始化
    * 如何调用数组的指定位置的元素
    * 如何获取数组的长度
    * 如何遍历数组
    * 数组元素的默认初始化值
        * 整型：0
        * 浮点型：0.0
        * char型：0或'\u0000'
        * boolean：false
        * 引用数据类型：null
    * 数组的内存解析  
  * 多维数组的使用
    * 二维数组的声明和初始化
    * 如何调用数组的指定位置的元素
    * 如何获取数组的长度
    * 如何遍历数组
    * 数组元素的默认初始化值
       * 整型：0
       * 浮点型：0.0
        * char型：0或'\u0000'
        * boolean：false
        * 引用数据类型：null
    * 数组的内存解析  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
          
                   