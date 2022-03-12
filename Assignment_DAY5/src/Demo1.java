import java.util.Scanner;


public class Demo1 {
    public static void main(String[] args)
    {
        Scanner pw=new Scanner(System.in);
        System.out.println("Enter your Password");
       String  cpw="kani";
       try {
           String s=pw.nextLine();
           if(cpw!=s)
           {
               throw new InvalidStringException();
           }
           else
           {
               //throw new InvalidStringException("");
           }


       }
       catch (InvalidStringException e)
       {
           System.out.println(e);
       }
       finally {
           System.out.println("Password check");
       }
    }
}
