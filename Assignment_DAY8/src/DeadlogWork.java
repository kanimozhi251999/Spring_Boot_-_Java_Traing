//Assignment 2
public class DeadlogWork {
    public static void main(String[] args)
    {
        Thread currentThread=Thread.currentThread();
        System.out.println(currentThread.getName() +"Thread start");
        try {
            currentThread.join(10);

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(currentThread.getName() +"Thread Ending");
    }
}
