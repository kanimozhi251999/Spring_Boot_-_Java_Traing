public class Ass1 {
    static int foo(int num) throws Exception {
        try {
            int a = 50 / num;
            String s = null;
            int f = s.length();

        } catch (Exception e) {
            throw new Exception("ArithmaticException", e);
        }
       return num;
    }

    static int bar()  //throws NullPointerException
    {
        try {
            String s=null;
            int f=s.length();
            //System.out.println("Nullpointer exception");

        }
        catch (NullPointerException e1) {
            throw new NullPointerException("Null Pointer exception");

        }
        return 0;
    }
    static int bar2() throws ArrayIndexOutOfBoundsException {
        try {
           int a[]=new int[8];
           a[10]=39;//System.out.println("Nullpointer exception");

        } catch (ArrayIndexOutOfBoundsException e1) {
            throw new ArrayIndexOutOfBoundsException("Null Pointer exception");

        }
        return 0;
    }


        public static void main(String[] args) throws Exception,NullPointerException,ArrayIndexOutOfBoundsException {
        int value = foo(0);
         bar();
         bar2();

    }

}