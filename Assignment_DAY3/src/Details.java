//method overloading
class Stu
{
    static void Stu(int id)
    {
        System.out.println("Student id :" +id );
    }
    static void Stu(int w,float h)
    {
        System.out.println("Student weight :" +w);
        System.out.println("Student height :" +h);
    }
    static  void Stu(String n,int y)
    {
        System.out.println("Student Name :" +n);
        System.out.println("Student of Year :" +y);

    }
}
public class Details {
    public static void main(String[] args)
    {
        Stu s=new Stu();
        s.Stu(2);
        s.Stu(43, (float) 170.3);
        s.Stu("kani",3);

    }

}
