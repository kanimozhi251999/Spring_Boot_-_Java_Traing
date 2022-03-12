import java.lang.reflect.Array;

public class Ass4 {
    public static void main(String[] args)
    {
        try {
            int a=50/1;//Arithmatic Exception

            String s=null;
            int k=s.length();//NullPointerException

            int a1[]=new int[5];
            a1[10]=38;//ArrayIntexOutOfBounds
        }
        //catch (Exception e)
        catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            //System.out.println(e);
        }

    }
}
