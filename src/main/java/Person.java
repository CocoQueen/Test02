/**
 * @author Coco
 * @date 2020/12/16
 */
public class Person {
    //属性(成员变量)
    String name;
    boolean isMarried;

    //构造器
    public Person() {
    }

    public Person(String name, boolean isMarried) {
        this.name = name;
        this.isMarried = isMarried;
    }
    //方法（函数）
    public void walk(){
        System.out.println("人走路...");
    }
    public String display(){
        return "名字是："+name+",Married:"+isMarried;
    }
    //代码块
    {
        name="HanMeiMei";
        isMarried=true;
    }
    //内部类
    class pet{
        //属性(成员变量)
        String name;
        float weight;
    }
}
