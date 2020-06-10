package test;

/**
 * @Author zhiming.li
 * @Date 2020/6/10 9:09
 */
public class People {
    private String name;
    private int age;

    public People(String name,int age){
        this.name=name;
        this.age=age;
    }
    void talk(){

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
