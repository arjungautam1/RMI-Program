import java.rmi.Naming;

/**
 * Created By Arjun Gautam
 * Date :04/01/2022
 * Time :4:55 PM
 * Project Name :RMIDemo
 */

public class MyClient {
    public static void main(String args[]) throws Exception{

        Adder a=(Adder) Naming.lookup("rmi://localhost:5000/as");

        int s=a.add(20,20);
        System.out.println("Sum ="+s);

    }
}
