//Assignment 4
class Details extends Thread
{
    public void run()
    {
            System.out.println("Student name :Kanimozhi");
            System.out.println("Student Id: 107 ");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }

    }
}
class Address extends Thread
{
    public void run()
    {
            System.out.println("Do.No :17a,");
            System.out.println("Street name :North street");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }

    }
}

public class Example {
    public static void main(String[] args)throws InterruptedException
    {
        Details details=new Details();
        Address address=new Address();
        details.run();
        details.join();
        //details.getName();
        address.run();
    }
}
