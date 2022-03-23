package Multiple;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultipleServer {
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();//establishes connection
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String  str=(String)dis.readUTF();
            String  str2=(String)dis.readUTF();
            String  str3=(String)dis.readUTF();
            String  str4=(String)dis.readUTF();

            System.out.println("message= "+ str +" " +str2);
            System.out.println("message= "+ str3 +" " +str4);

            ss.close();
        }catch(Exception e){System.out.println(e);}
    }
}
