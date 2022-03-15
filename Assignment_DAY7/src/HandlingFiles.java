import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HandlingFiles {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\LENOVO\\Desktop\\files");
        file.mkdir();//Create tha folder
        File file1=new File("C:\\Users\\LENOVO\\Desktop\\files\\Text.txt");//Create the txet file inside files folder
        file1.createNewFile();
//        boolean present=file1.exists();
//       if (present==true) {
//            System.out.println("File already created: "
//                    + file1.getName());
//        }
//        else {
//          System.out.println("create a file please");
//          file1.createNewFile();
//        }
        FileWriter Writer = new FileWriter("C:\\Users\\LENOVO\\Desktop\\files\\Text.txt");
        Writer.write("My name is kanimozhi.I love my family...");//Wtite tha word in file
        System.out.println("Successfully written.");
        Writer.close();


        FileReader reader=new FileReader("C:\\Users\\LENOVO\\Desktop\\files\\Text.txt");
        Scanner Reader = new Scanner(reader);//Read tha file data
        if (Reader.hasNextLine()) {
            String data = Reader.nextLine();
            System.out.println(data);
        }
        else
        {
            System.out.println("Error of file");
        }

        Reader.close();



//        File file2=new File("C:\\Users\\LENOVO\\Desktop\\newFiles");
//        file2.mkdir();//Create tha folder
//        File file3=new File("C:\\Users\\LENOVO\\Desktop\\newFiles\\NewText.txt");//Create the txet file inside files folder
//        file3.createNewFile();
//        boolean present1=file3.exists();
//        if (present1==true) {
//            System.out.println("File Next new file created: "
//                    + file3.getName());
//        }
//        else {
//            System.out.println("create a file please");
//            file3.createNewFile();
//        }

    }
}
