package SocketClientServer;

import java.io.*;
import java.net.Socket;

public class Client_2 {
    public static void main(String[] args){
        try {
            Socket socket=new Socket("192.168.0.135",8888);
            DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader((System.in)));
            String msg1="";
            String msg2="";
            while(!msg1.equals("end")){
                msg1=bufferedReader.readLine();
                dataOutputStream.writeUTF(msg1);
                dataOutputStream.flush();
                msg2=dataInputStream.readUTF();
                System.out.println("Server says:"+msg2);
            }
            dataOutputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


