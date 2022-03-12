//Assignment1
class Spec {

    public void dis()
    {
        System.out.println("Public");
    }
    private void dis1()//private constructor
    {
        System.out.println("Private");
    }
    protected void dis2()
    {
        System.out.println("Protected");
    }

}
public class AS {
    public static void main(String[] srgs)
    {

        Spec n=new Spec();
        n.dis();
        n.dis2();
        // n.dis1();//Compile Time Error
    }

}