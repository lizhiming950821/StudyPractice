package test;

import java.util.Random;

/**
 * @Author zhiming.li
 * @Date 2020/6/10 14:44
 */
public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] staff=new Employee[3];

        staff[0]=new Employee("haha",40000);
        staff[1]=new Employee(60000);
        staff[2]=new Employee();
        for (Employee e : staff){
            System.out.println(e.getName()+e.getId()+e.getSalary());
        }
    }
}

class Employee {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    static {
        Random generator = new Random();
        nextId=generator.nextInt(1000);
    }

    {
        id=nextId;
        nextId++;
    }

    public Employee(String n,double s){
        name=n;
        salary=s;
    }
    public Employee(double s){
        this("Employee #"+nextId,s);
    }
    public Employee(){

    }
}
