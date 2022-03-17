import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//import static jdk.internal.org.jline.utils.Colors.s;

//import java.awt.print.Book;
//interface Sayable{
//    public String say();
//    List<String> alphabets = new ArrayList<>( Arrays.asList("aa", "bbb", "cac", "dog")); // looping over all elements using Iterable.forEach() method alphabets.forEach(s -> System.out.println(s));
//
//}
public class LamExpression {
    public static <Product> void main(String[] args)
    {
//        Runnable Book = () ->
//        {
//            int sum = 0;
//            for (int i = 0; i < 10; i++) {
//                sum = sum + i;
//
//            }
//            System.out.println(Thread.currentThread().getName() + " -value :" + sum);
//
//            System.out.println("Thread A- sum of :" + sum);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//            //  A a=new A();
//            Runnable book=new Runnable() {
//                @Override
//                public void run() {
//
//                }
//            }
//            Thread thread = new Thread((Runnable) book);
//            // thread.start();
//
//
//        };

        List<String> alphabets = new ArrayList<>( Arrays.asList("aaa", "bb", "cccc", "ddddd")); // looping over all elements using Iterable.forEach() method alphabets.forEach(s -> System.out.println(s));

       alphabets.forEach(s-> System.out.println("Array list :" +s));

       alphabets.stream()
                .filter(s -> s.length() > 2)
                .forEach(System.out::println);

    }


    }

