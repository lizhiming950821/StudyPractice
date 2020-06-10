package exception;

import java.rmi.RemoteException;

/**
 * @Author zhiming.li
 * @Date 2020/6/10 10:22
 */
public class MoreException {
    public void deposit(double amount) throws RemoteException
    {
        throw new RemoteException();

    }
}
