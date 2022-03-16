//import jdk.incubator.vector.VectorOperators;

//Assignment 1
public class TestGarbage {
   // private final String obj_name;

    //int i=0;
    public void finalize()

    {
        System.out.println("This is garbage collection" );
        //System.out.println(this.obj_name + " successfully garbage collected");
    }
//    String obj_name="kani";
//    obj_name=null;

//    class TestGarbage1(String obj_name)
//    {
//        this.obj_name = obj_name;
//    }
    public static  void main(String[] args)
    {
        TestGarbage testGarbage=new TestGarbage();
        testGarbage=null;
        new TestGarbage();
        Integer i=new Integer(4);
        i=null;
        String s=new String("kani");
        s=null;
        //new TestGarbage1("t1");
         System.gc();

    }
}
