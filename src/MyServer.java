import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Created By Arjun Gautam
 * Date :04/01/2022
 * Time :4:55 PM
 * Project Name :RMIDemo
 */

public class MyServer {
    public static void main(String[] args) {
        try {
            Adder adder = new AdderRemote();
            Naming.rebind("rmi://localhost:5000/rmiserver", adder);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
