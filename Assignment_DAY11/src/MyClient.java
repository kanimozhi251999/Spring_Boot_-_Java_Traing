import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyClient {
    public static void main(String args[])throws Exception{
        Socket socket=new Socket("localhost",8888);
        DataInputStream din=new DataInputStream(socket.getInputStream());
        DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Say Something !");
        String str="",str2="";
        while(!str.equals("end")){
            str=br.readLine();
            dout.writeUTF(str);
            dout.flush();
            str2=din.readUTF();
            System.out.println("Server says: "+str2);
        }

        dout.close();
        socket.close();
    }}
