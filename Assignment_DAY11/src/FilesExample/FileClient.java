package FilesExample;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class FileClient {
    public static void main(String args[])throws Exception {
        byte b[]=new byte[20002];
        Socket socket = new Socket("localhost", 8888);
        InputStream is=socket.getInputStream();
        FileOutputStream fr=new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\files\\NewText.txt");
        is.read(b,0,b.length);
        fr.write(b,0,b.length);
    }
    }
