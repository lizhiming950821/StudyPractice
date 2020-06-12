package lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author zhiming.li
 * @Date 2020/6/12 10:36
 */
public class Test {
    public static void main(String[] args) {

        String s[] = {"aa","b","ccc"};
        Arrays.sort(s,new MyComparator());
        // 输出
        Arrays.stream(s).forEach(System.out::println);
    }
}
class MyComparator implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        return s.length() - t1.length();
    }
}
