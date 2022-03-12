public class Ass3 {

    public static void main(String[] args) {
        System.out.println("Name :" + Student.method().name);
        System.out.println("Age :" + Student.method().age);


    }
}
class Student
{
    String name;
    Integer age;
    public static  Student method()
    {
        Student student=new Student();
        student.name="kani";
        student.age=22;
        return student;

    }
}