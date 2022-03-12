//Assignment 2 Abstract class
abstract public class Enginering {
    abstract void ClearAllExam();

    void Attence() {
        System.out.println("Your attence must be 90% abouve");
    }

}
class Unversity extends Enginering
{
    void ClearAllExam()
    {
        System.out.println("You are not clear all exam");
    }
}
class College {
    public static void main(String[] args) {
        Unversity eg=new Unversity();
        {
            eg.ClearAllExam();
            eg.Attence();

        };


    }
}