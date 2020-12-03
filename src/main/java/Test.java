public class Test {
    String name;
    int age;


    public Test() {
    }
    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Test(int age) {
        this.age = age;
    }

    public Test(String name) {
        this.name = name;
    }
    public Test(Test test){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
