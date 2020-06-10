package exception;

/**
 * 单捕获异常
 * @Author zhiming.li
 * @Date 2020/6/10 10:02
 */
public class ArrayIndexOutOfBoundsExceptiuon {
    public static void main(String[] args) {
        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }
}

