public class HelloWorld
{
    static void show()
    {
        System.out.println("The static method");
    }
    void display()
    {
        System.out.println("Non-static method");
    }
    public static void main(String[] args)
    {
        show(); //called method
        HelloWorld me=new HelloWorld();
        me.display(); //called method
    }
}
