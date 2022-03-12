public class Ass2 {
    public static void main(String[] args)
    {
        try
        {
            int a[]=new int[5];
            a[10]=80;
        }
        catch (Exception e)
        {
            System.out.println("Array is out of range " +e);
        }

    }

}
