import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created By Arjun Gautam
 * Date :04/01/2022
 * Time :4:54 PM
 * Project Name :RMIDemo
 */

public class AdderRemote extends UnicastRemoteObject implements Adder {

    AdderRemote() throws RemoteException
    {
        super();
    }
    public int add(int x,int y){
        return x+y;
    }

}
