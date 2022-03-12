//Assignment 4.Constructor overloading
class Area {
    Area()
    {
        System.out.println("Persion Details");
    }
    Area(Integer n) {
        System.out.println("Persion id :" + n);
    }
    Area(String n, Integer a) {
        System.out.println("Persion name :" + n);
        System.out.println("age :" + a);
    }
}
public class Persion {
    public static void main(String arg[]) {
        Area a2=new Area();
        Area a = new Area(8);
        Area al = new Area("kani", 43);

    }
    //Area a2 = new Area(10, 5);
}
