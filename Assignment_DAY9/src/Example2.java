//Assignment 1
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Details{
    //int id;
    String name;
     int id;
    public Details(int id, String name) {
        this.id = id;
        this.name = name;
        }
}
public class Example2 {
    public static void main(String[] args) {
        List<Details> studentList = new ArrayList<Details>();
        //Adding Products
        studentList.add(new Details(1,"Kanimozhi"));
       studentList.add(new Details(2,"Rajesh"));
        studentList.add(new Details(3,"Raj"));
        studentList.add(new Details(4,"Abi"));
        studentList.add(new Details(5,"sarah"));
        studentList.stream()
                        .filter(f->f.id>3)
                        .map(s->s.name)
                .forEach(System.out::println);

       //Stream<Details> filtered_data = studentList.stream().filter(p -> p.id > 4);

        //filtered_data.forEach(s -> System.out.println(Details.id+": "+Details.name));

    }
}

