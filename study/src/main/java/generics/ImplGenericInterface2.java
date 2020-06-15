package generics;

/**
 * @Author zhiming.li
 * @Date 2020/6/12 17:30
 */
public class ImplGenericInterface2 implements GenericIntercace<String> {
    @Override
    public String getData() {
        return "Generic Interface2";
    }

    public static void main(String[] args) {
        ImplGenericInterface2 implGenericInterface2 = new ImplGenericInterface2();
        System.out.println(implGenericInterface2.getData());
    }
}