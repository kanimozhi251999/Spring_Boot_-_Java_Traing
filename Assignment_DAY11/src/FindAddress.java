import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindAddress {
    public static void main(String[] args)
    {
        String name="";
        try {
            System.out.println("Host name address:" + InetAddress.getLocalHost());
            InetAddress ip=InetAddress.getByName(name);
            System.out.println("Host defaclt name "+ip);
            System.out.println("Ip address "+ip.getHostAddress());
            System.out.println("host name "+ip.getHostName());
            System.out.println(ip.isAnyLocalAddress());


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
