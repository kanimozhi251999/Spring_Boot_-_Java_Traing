import jdk.internal.access.JavaIOFileDescriptorAccess;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;

public class client {
    public static void main(String args[])throws Exception {
        Socket socket = new Socket("localhost", 8888);
        DataInputStream din = new DataInputStream(socket.getInputStream());
        InputStream inputStream = socket.getInputStream();

        System.out.println("Reading: " + System.currentTimeMillis());

        byte[] sizeAr = new byte[8];
        inputStream.read(sizeAr);
        int size = ByteBuffer.wrap(sizeAr).asIntBuffer().get();

        byte[] imageAr = new byte[size];
        inputStream.read(imageAr);

        BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageAr));
        ImageIO.write(image, "jpg", new File("C:\\Users\\LENOVO\\Desktop\\files\\test2.jpg"));

        JavaIOFileDescriptorAccess serverSocket;
        socket.close();
    }

}

