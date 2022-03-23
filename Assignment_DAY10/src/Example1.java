import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User
{
    public User(int id, String name, String location) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private Integer id;
    private String name;
    private  String location;
}
public class Example1 {
    public static void main(String[] args)
    {
        List<User> studentList = new ArrayList<User>();
        //Adding Products
        studentList.add(new User(1,"Kanimozhi","Tirunalvali"));
        studentList.add(new User(2,"Rajesh","Tirunalvali"));
        //User n=new User(2,"Rajesh","Tirunalvali");

    class Pair<K,V>{
        private Map<K,V> map = new HashMap<K,V>();

//        public void addKeyValue(K key, V value) {
//           // K User = null;
//
//            //map.put(K, value);
//           // map.get(User);
//
//            map.getClass(User);
//        }

        public V getValue(K key) {
            return map.get(key);
        }}
    }

}
