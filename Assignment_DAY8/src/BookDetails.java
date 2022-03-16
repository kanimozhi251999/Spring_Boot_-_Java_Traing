//Assignment 3
class Book implements Runnable
{
    public void run()
    {
        System.out.println("Two table");

        for(int i=1;i<=5;i++)
      {
          System.out.println(i +" X 2 ="+i*2);
          try {
              Thread.sleep(1000);
          }
          catch (InterruptedException e)
          {
              System.out.println(e);
          }
      }
    }
}
class Numbers implements Runnable
{
    public void run()
    {
        System.out.println("Five table");

        for(int i=1;i<=5;i++)
        {
            System.out.println(i+" X 5 =" +i*5);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class BookDetails {
    public static void main(String[] args)throws InterruptedException
    {
        Runnable book=new Book();
        Runnable numbers=new Numbers();
        Thread thread=new Thread(book);
        Thread thread1=new Thread(numbers);
        thread.start();
        thread.join();
        thread1.start();
    }
}
