import java.util.*;

public class Generic {
    public static void main(String[] args) {
        User1 user = new User1();
        // Generic generic=new Generic();

        user.display();

    }
}
class User1 {
    Integer id;
    String name;
    String location;

    public User1(Integer id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public User1() {
//        List<User1> list = new ArrayList<>();
//        list.add(new User1(1, "hari", "Theni"));
//        list.add(new User1(2, "ram", "tirunalvali"));

    }



    public void display() {
        List<User1> list = new ArrayList<>();
        list.add(new User1(1, "hari", "Theni"));
        list.add(new User1(2, "ram", "tirunalvali"));
     User1 user1=new User1();

        Map<List<User1>,String> map=new HashMap<>();

        map.put(list,"Icanio");
        //System.out.println(map);
        if (map.containsKey(list)){
            System.out.println(map.values());
        }

    }
}


