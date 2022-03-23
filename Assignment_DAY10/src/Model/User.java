package Model;

import java.util.HashMap;
import java.util.Map;

public class User <T>{

 T id;
T name;
T location;

 public User(T id, T name ,T location) {
 this.id = id;
this.name = name;
 this.location = location;
}

 public User() {

}

 public <K , V> V getValuByKey(Map<K,V> map, K key){
 for (Map.Entry<K, V> entry : map.entrySet()){
 if (key.equals(entry.getKey())){
return entry.getValue();
 }
}
return null;
 }


 public static void main(String[] args){

User u1 = new User(1, "kanimozhi", "Tirunalvali");
 User user = new User();
 Student u2 = new Student("Icanio");
Map<User, Student> map = new HashMap<User, Student>();
 map.put(u1,u2);
System.out.println(user.getValuByKey(map,u1));
 }

}

