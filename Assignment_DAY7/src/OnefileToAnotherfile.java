import java.io.*;
import java.util.Scanner;

public class OnefileToAnotherfile {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("C:\\Users\\LENOVO\\Desktop\\files\\Text.txt");
        FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Desktop\\newFiles\\NewText.txt");
        String str = "";
        int i;
        while ((i = reader.read()) != -1) {
            str += (char)i;
        }

        System.out.println(str);

        writer.write(str);
        System.out.println("Write successfully");

        reader.close();

        writer.close();
        File del=new File("C:\\Users\\LENOVO\\Desktop\\files\\Text.txt");
        del.delete();


    }

}
