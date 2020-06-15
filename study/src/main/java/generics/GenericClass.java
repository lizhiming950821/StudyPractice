package generics;

/**
 * @Author zhiming.li
 * @Date 2020/6/12 15:10
 */
public class GenericClass<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        GenericClass<String> genericClass=new GenericClass<>();
        genericClass.setData("Generic Class");
        System.out.println(genericClass.getData());
    }
}
