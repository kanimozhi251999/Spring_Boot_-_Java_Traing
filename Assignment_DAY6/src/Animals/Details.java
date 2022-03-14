
import Animals.*;
import Animals.Dog.Doberman;

public class Details {
    public static void main(String[] args)
    {
        Beast beast=new Beast();
        beast.beast();//Package Animals
        Doberman doberman=new Doberman();
        doberman.doberman();//Package Dog
       // doberman.Cooper();
       Animals.Cat.Persian c=new Animals.Cat.Persian();//Package Cat
        c.persian();
    }
}
