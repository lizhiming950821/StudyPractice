package exception;

/**
 * @Author zhiming.li
 * @Date 2020/6/10 11:28
 */
public class InsufficientFundsException extends Exception{
    //此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
    private double amount;
    public InsufficientFundsException(double amount)
    {
        this.amount = amount;
    }
    public double getAmount()
    {
        return amount;
    }
}
