
public class RunTest {
    public static void main(String[] args) {
        Test test = new Test();
        test.setAge(1);
        test.setName("test");
        int age = test.getAge();
        String name = test.getName();
        System.out.println("name:" + name + "==age:" + age);
        Test test1 = new Test();

    }


}
