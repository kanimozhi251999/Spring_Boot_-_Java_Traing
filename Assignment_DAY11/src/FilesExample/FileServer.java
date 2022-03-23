package FilesExample;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String args[])throws Exception {
        ServerSocket ss = new ServerSocket(8888);
        Socket s1 = ss.accept();
        FileInputStream fr = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\files\\Text.txt");
        byte b[]=new byte[20002];
        fr.read(b,0,b.length);
        OutputStream os=s1.getOutputStream();
        os.write(b,0,b.length);

    }

    }
