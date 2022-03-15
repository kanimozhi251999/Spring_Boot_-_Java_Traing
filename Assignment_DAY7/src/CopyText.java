import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyText {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\LENOVO\\Desktop\\Text1.txt");//Create the txet file inside files folder
           f.createNewFile();
        Scanner sc = new Scanner(f);
        StringBuffer buffer = new StringBuffer();
        while (sc.hasNext()) {
            buffer.append(" " + sc.nextLine());
        }
        System.out.println("Contents of the file: " + buffer);
        File dest = new File("C:\\Users\\LENOVO\\Desktop\\NewText2.txt");
        dest.createNewFile();
        FileWriter writer = new FileWriter(dest);
        writer.write(buffer.toString());
        writer.flush();
        System.out.println("File copied successfully.......");
        sc.close();
        writer.close();

        if(f.delete())
        {
            System.out.println("File deleted");
        }
        else {
            System.out.println("file not deleted");
        }
    }
}

