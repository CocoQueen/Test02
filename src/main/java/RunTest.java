
public class RunTest {
    public static void main(String[] args) {
        Test test = new Test();
        test.setAge(1);
        test.setName("test");
        int age = test.getAge();
        String name = test.getName();
        System.out.println("name:" + name + "==age:" + age);
        Test test1 = new Test();

        //逻辑运算符面试题
        boolean x = true;
        boolean y = false;
        short z = 42;

        if ((z++ == 42) && (y = true)) z++;
        if ((x = false) || (++z == 45)) z++;
        System.out.println("z=" + z);

        //位运算
        int a = 21;
        System.out.println((a << 27));

        System.out.println(~-7);

        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;
        //方式一
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1:" + num1 + " num2:" + num2);
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
        int m=12;
        int n=5;
        int max=(m>n)?m:n;
        int max2= Math.max(m, n);
        System.out.println(max);
        System.out.println(max2);

    }


}
