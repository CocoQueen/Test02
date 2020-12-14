package project01;

/**
 * @author Coco
 * @date 2020/12/14
 * @desprision
 */
public class Project1 {
    /*
     *  目标：
     * 模拟实现一个基于文本界面的《家庭记账软件》
     * 掌握初步的编程技巧和调试技巧
     * 主要涉及以下知识点：
     *   变量的定义
     *   基本数据类型的使用
     *   循环语句
     *   分支语句
     *   方法声明、调用和返回值的接收
     *   简单的屏幕输出格式控制
     *  需求说明：
     * 模拟实现基于文本界面的《家庭记账软件》
     * 该软件能够记录家庭的收入、支出，并能够打印收支明细表
     * 项目采用分级菜单方式。主菜单如下：
     *  ----------家庭收支记账软件------------------
     *              1、收支明细
     *              2、登记收入
     *              3、登记支出
     *              4、退出
     *              请选择（1-4）：_
     *
     *  假设家庭起始的生活基本金为10000元
     * 每次登记收入（菜单2）后，收入的金额应累加到基本金上，并记录本次收入明细，以便后续的查询
     * 每次登记支出（菜单3）后，支出的金额应从基本金中扣除，并记录本次支出明细，以便后续的查询
     * 查询收支明细（菜单1）时，将显示所有的收入、支出明细列表
     *
     * 登记收入的界面及操作过程如下所示：
     * 1、收支明细
     * 2、登记收入
     * 3、登记支出
     * 4、退出
     * 请选择（1-4）：_
     * 本次收入金额：1000
     * 本次收入说明：劳务费
     *
     * 基本金和收支明细的记录
     * 基本金的记录可以使用int类型的变量来实现：int balance =10000；
     * 收支明细记录可以使用String类型的变量来实现，其初始值为明细表的表头。例如：String details =“收支\t账户金额\t收支金额\t说明\n ”
     * 在登记收支时，将收支金额与balance相加或相减，收支记录直接串接到details后面即可。
     *
     * */

    public static void main(String[] args) {
        boolean isFlag = true;
        //用于记录用户的收入和支出的详情
        String details = "收支\t账户金额\t收支金额\t说 明\n";
        int balance = 10000;
        while (isFlag) {
            System.out.println(" ----------家庭收支记账软件-----------\n");
            System.out.println("            1、收支明细");
            System.out.println("            2、登记收入");
            System.out.println("            3、登记支出");
            System.out.println("            4、退   出\n");
            System.out.print("            请选择（1-4）：");
            //获取用户的选择
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println(" ----------当前收支明细-----------\n");
//                    System.out.println("收支\t账户金额\t收支金额\t说 明\n");
                    System.out.println(details);
                    System.out.println("-----------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int money = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String info = Utility.readString();
                    balance += money;
                    details += ("收入\t" + balance + "\t" + money + "\t\t" + info+"\n");

                    System.out.println("-------登记完成-----------");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int money2 = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String info2 = Utility.readString();
                    if (balance>=money2){
                        balance -= money2;
                        details += ("支出\t" + balance + "\t" + money2 + "\t\t" + info2+"\n");
                    }else {
                        System.out.println("支出超出账户额度，支付失败");
                    }
                    System.out.println("-------登记完成-----------");
                    break;
                case '4':
                    System.out.print("确认是否退出（Y/N）:");
                    char confirm = Utility.readConfirmSelection();
                    if (confirm == 'Y') {
                        isFlag = false;
                    }
                    break;

            }
        }
    }
}
