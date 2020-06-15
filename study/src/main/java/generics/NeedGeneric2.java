package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhiming.li
 * @Date 2020/6/12 14:24
 */
public class NeedGeneric2 {
    static class C{

    }
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("A");
        list.add("B");
        list.add(new C());
        list.add(100);
        //1.当我们将一个对象放入集合中，集合不会记住此对象的类型，当再次从集合中取出此对象时，该对象的编译类型变成了Object类型，但其运行时类型仍然为其本身类型。
        //2.因此 //1处取出集合元素时需要人为的强制类型转化到具体的目标类型，且很容易出现“java.lang.ClassCastException”异常。
        for (int i = 0; i < list.size(); i++) {
            String value= (String) list.get(i);
            System.out.println(value);
        }
    }
}
