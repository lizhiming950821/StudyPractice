package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author zhiming.li
 * @Date 2020/6/15 10:30
 */
public class Test01<T> {
    public static void main(String[] args) {
        Test01<String> gt = new Test01<>();
        gt.doSome("haha");

        Test01<Integer> in = new Test01<>();
        in.doSome(100);
    }

    public void doSome(T t) {
        System.out.println(t);
    }
}
