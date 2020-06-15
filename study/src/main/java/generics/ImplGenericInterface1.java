package generics;

/**
 * 泛型接口实现类-泛型类实现方式
 * @Author zhiming.li
 * @Date 2020/6/12 15:42
 */
public class ImplGenericInterface1<T> implements GenericIntercace {
    private T data;

    private void setData(T data) {
        this.data = data;
    }

    @Override
    public T getData() {
        return data;
    }

    public static void main(String[] args) {
        ImplGenericInterface1<String> implGenericInterface1 = new ImplGenericInterface1<>();
        implGenericInterface1.setData("Generic Interface1");

        System.out.println(implGenericInterface1.getData());

    }
}
