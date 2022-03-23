import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServers {
    public static void main(String args[])throws Exception{
        ServerSocket ss=new ServerSocket(8888);
        Socket s1=ss.accept();
        DataInputStream din=new DataInputStream(s1.getInputStream());
        DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str="",str2="";
        while(!str.equals("end")){
            str=din.readUTF();
            System.out.println("client says: "+str);
            str2=br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        s1.close();
        ss.close();
    }}
