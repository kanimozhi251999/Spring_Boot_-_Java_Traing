//ASSIgment2 Return Boolean value
public class Ass2
{
    public static boolean isEven (int a, int b)
    {
        if (a > b) {
            return cal(false);
        } else {
            return cal(true);
        }
    }

    public static boolean cal ( boolean n)
    {
        if (n == true) {
            System.out.println("True value");
        } else {
            System.out.println("false valude");
        }
        return n;
    }
    public static void main(String[] args) {

        isEven(9,19);

    }
}
