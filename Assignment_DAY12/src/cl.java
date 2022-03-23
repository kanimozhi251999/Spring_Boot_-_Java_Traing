
import java.io.DataOutputStream;
import java.net.Socket;

public class cl {
    public static void main(String[] args)
    {
        try{
            Socket s=new Socket("192.168.0.227",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Abi");
            // dout.writeUTF("How are you?");
            dout.flush();
            dout.close();
            s.close();
            System.out.println("client massage successfully send.");
        }
        catch(Exception e){System.out.println(e);}
    }
}

