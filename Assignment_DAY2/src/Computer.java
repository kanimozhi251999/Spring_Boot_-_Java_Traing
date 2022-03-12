public class Computer {
    public  static  void add(int a,String b,Student1 stu)
    {
        //int sum=a+b;
        System.out.println("Persion age:" +a);
        System.out.println("Persion Name:" +b);
        System.out.println("Persion height:" +stu);
    }
    public static  void main(String[] args) {
        Computer c=new Computer();
        c.add(22,"kani",Student1.method());

    }
}
class Student1
{
    // String name;
    //Integer age;
    public static  Student1 method()
    {
        Student1 student=new Student1();
        //student.name="kani";
        //student.age=22;
        return student;

    }
}