package exception;

/**
 * @Author zhiming.li
 * @Date 2020/6/10 11:05
 */


//自定义异常类，继承Exception类
public class ExtendsException extends Exception
{
    //此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
    private double amount;
    public ExtendsException(double amount)
    {
        this.amount = amount;
    }
    public double getAmount()
    {
        return amount;
    }
}
