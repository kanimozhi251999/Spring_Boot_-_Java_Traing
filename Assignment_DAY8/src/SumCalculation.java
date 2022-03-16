
class A implements Runnable
{
    public void run()
    {
        int sum=0;
        for(int i=0;i<10;i++) {
            sum = sum + i;
            System.out.println( Thread.currentThread().getName() +" -value :" +sum);

        }

        System.out.println("Thread A- sum of :"+sum);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }

class B implements Runnable
{
     public void run()
    {
        //System.out.println("Five table");
        int sum=0;
        for(int i=0;i<10;i++) {
            sum = sum + i;
            System.out.println( Thread.currentThread().getName()+" -value :" +sum);

        }

        System.out.println("Thread B-sum of :" +sum);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
class C extends Thread
{
    public void run()
    {
        // System.out.println("Two table");
        int sum=0;
        for(int i=0;i<10;i++) {
            sum = sum + i;
            System.out.println( Thread.currentThread().getName()+" -value :" +sum);

        }
        System.out.println("Thread C- sum of :"+sum);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
public class SumCalculation {
    public static void main(String[] args)throws InterruptedException
    {
        Runnable a=new A();
        Runnable b=new B();
        C c=new C();
        Thread thread=new Thread(a);
        Thread thread1=new Thread(b);
        thread.start();
        thread.setName("Thread-A");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.join();
        thread1.start();
        thread1.setName("Thread-B");
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread1.join();
        c.start();
        c.setName("Thread-C");
        //c.setPriority(Thread.MAX_PRIORITY);


    }
}
