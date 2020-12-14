import java.util.Scanner;

public class RunTest {
    public static void main(String[] args) {
//        Test test = new Test();
//        test.setAge(1);
//        test.setName("test");
//        int age = test.getAge();
//        String name = test.getName();
//        System.out.println("name:" + name + "==age:" + age);
//        Test test1 = new Test();

        //逻辑运算符面试题
//        boolean x = true;
//        boolean y = false;
//        short z = 42;
//
//        if ((z++ == 42) && (y = true)) z++;
//        if ((x = false) || (++z == 45)) z++;
//        System.out.println("z=" + z);

        //位运算
//        int a = 21;
//        System.out.println((a << 27));
//
//        System.out.println(~-7);

        //练习：交换两个变量的值
//        int num1 = 10;
//        int num2 = 20;
        //方式一
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//        System.out.println("num1:" + num1 + " num2:" + num2);
        //方式2：
        // 好处：不用定义临时变量
        // 弊端：相加操作可能超出存储范围；有局限性:只能适用于数值类型
//        num1 = num1 + num2;
//        num2 = num1 - num2;
//        num1 = num1 - num2;
//        System.out.println("num1:" + num1 + " num2:" + num2);
        //方式3：使用位运算符 ^   有局限性：只能适用于数值类型
//        num1 = num1 ^ num2;
//        num2 = num1 ^ num2;
//        num1 = num1 ^ num2;
//        System.out.println("num1:" + num1 + " num2:" + num2);

        //获取两个整数的较大值
//        int m = 12;
//        int n = 5;
//        int max = (m > n) ? m : n;
//        int max2 = Math.max(m, n);
//        System.out.println(max);
//        System.out.println(max2);

        //测算狗的年龄
//        Scanner scanner = new Scanner(System.in);
//        int dogAge = scanner.nextInt();
//        if (dogAge >= 0 && dogAge <= 2) {
//            System.out.println("相当于人的年龄：" + dogAge * 10.5);
//        } else if (dogAge > 2) {
//            double peopleAge = 2 * 10.5 + (dogAge - 2) * 4;
//            System.out.println("相当于人的年龄："+peopleAge);
//        }else {
//            System.out.println("输入的年龄格式不正确");
//        }

        //随机数生成：10-99
//        int random = (int) (Math.random()*90+10);
//        System.out.println(random);

        //键盘输入+if-else结构运用
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你的身高：（cm）");
//        int height = scanner.nextInt();
//        System.out.println("请输入你的财富：（千万）");
//        double wealth = scanner.nextDouble();
//        System.out.println("请输入是否帅：（true/false）");
//        boolean isHandsome = scanner.nextBoolean();
//        if (height >= 180 && wealth >= 1 && isHandsome) {
//            System.out.println("符合条件");
//        } else if (height >= 180 || wealth >= 1 || isHandsome) {
//            System.out.println("勉强符合条件");
//        } else {
//            System.out.println("不符合");
//        }
        //swich-case
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("1111");
                break;
            case 2:
                System.out.println("2222");
                break;
            default:
                System.out.println("0000");
                break;
        }
        //通过程序输出输入的日期是2020年的第几天
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入月：");
//        int month = scanner.nextInt();
//        System.out.println("请输入日：");
//        int day = scanner.nextInt();
//        int sumDay = 0;
//        switch (month) {
//            case 12:
//                sumDay += 30;
//            case 11:
//                sumDay += 31;
//            case 10:
//                sumDay += 30;
//            case 9:
//                sumDay += 31;
//            case 8:
//                sumDay += 31;
//            case 7:
//                sumDay += 30;
//            case 6:
//                sumDay += 31;
//            case 5:
//                sumDay += 30;
//            case 4:
//                sumDay += 31;
//            case 3:
//                sumDay += 29;
//            case 2:
//                sumDay += 31;
//            case 1:
//                sumDay += day;
//        }
//        System.out.println("2020年" + month + "月" + day + "日是今年的第"+sumDay+"天");

        /*
         * 编写程序从1循环到150，并在每行打印一个值
         * 另外在每个3的倍数行上打印出”foo“
         * 在每个5的倍数上打印出”biz“
         * 在每个7的倍数上打印出”baz“
         * */
//        for (int i = 1; i <= 150; i++) {
//            System.out.print(i + "    ");
//            if (i % 3 == 0) {
//                System.out.print("foo    ");
//            }
//            if (i % 5 == 0) {
//                System.out.print("biz    ");
//            }
//            if (i % 7 == 0) {
//                System.out.print("baz    ");
//            }
//            System.out.println();
//        }

        /*
         * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数
         * 比如：12和20的最大公约数是4，最小公倍数是60
         * 说明：break关键字的使用
         * */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入第一个正整数");
//        int m = scanner.nextInt();
//        System.out.println("请输入第二个正整数");
//        int n = scanner.nextInt();
        //获取两个数中的较小值
//        int min = (m <= n) ? m : n;
//        for (int i = min; i >= 1; i--) {
//            if (m % i == 0 && n % i == 0) {
//                System.out.println("最大公约数为：" + i);
//                break;//一旦在循环中执行到break，就跳出循环
//            }
//        }
        //获取两个数中的较大值
//        int max = (m >= n) ? m : n;
//        for (int i = max; i <= m * n; i++) {
//            if (i%m==0&&i%n==0){
//                System.out.println("最小公倍数为：" + i);
//                break;
//            }
//        }
        //while循环
//        int i = 1;
//        while (i <= 100) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
        //do-while循环
//        int num = 1;
//        do {
//            if (num % 2 == 0) {
//                System.out.println(num);
//            }
//            num++;
//        } while (num <= 100);

        //嵌套循环
//        for (int i = 1; i <= 5; i++) {//控制行数
//            for (int j = 1; j <= i; j++) {//控制列数
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        //开方
//        double sqrt = Math.sqrt(4);
//        System.out.println(sqrt);

        //break和continue关键字对比
//        for (int i = 1; i <= 10; i++) {
//            if (i % 4 == 0) {
////                break;//1、2、3
//                continue;//1、2、3、5、6、7、9、10
//            }
//            System.out.println(i);
//        }

        //结束指定标识的一层循环
//        label:for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <=10; j++) {
//                if (j % 4 == 0) {
////                    break label;//结束指定标识的一层循环
////                    continue label;;
//                }
//                System.out.print(j);
//            }
//            System.out.println();
//        }

    }
}
