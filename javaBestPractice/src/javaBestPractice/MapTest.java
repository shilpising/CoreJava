package javaBestPractice;

import java.util.HashMap;
import java.util.Map;

class DogMap {
    public String name;
    public DogMap(String n) { name = n; }
    @Override
    public boolean equals(Object o) {
        System.out.println("--- calling equals ---");
        if ((o instanceof DogMap) && 
            ((DogMap)o).name.equals(name)) { 
            return true; 
        } else {
            return false;
        }
    }
    public int hashCode() {
        return name.length();
    }
}
 
public class MapTest {
    public static void main(String[] args) {
        Map<Object, Object> m = new HashMap<Object, Object>();
         
        DogMap d = new DogMap("rufus");
        m.put(d, "mad dog");
        m.put(new Integer(10), "what a heck is going on!");
         
        d.name = "auau";
         
        System.out.println("starting calling the get dog...");
        System.out.println(m.get(d));
        System.out.println("finish calling the get dog...");
         
    }
}
