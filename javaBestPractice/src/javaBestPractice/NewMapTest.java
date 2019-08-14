package javaBestPractice;

import java.util.HashMap;
import java.util.Map;
 
class SurfBoard {
    public String name;
    public SurfBoard(String n) { name = n; }
    @Override
    public boolean equals(Object o) {
        System.out.println("... calling equals ....");
        if ((o instanceof SurfBoard) && 
            ((SurfBoard)o).name.equals(name)) {
            return true;
        } 
        return false;
    }
     
    public int hashCode() {
        return name.length();
    }
}
 
public class NewMapTest {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<Object, Object>();
         
        SurfBoard sb = new SurfBoard("longboard");
        map.put(sb, "I prefer an evolution model");
        map.put(new Integer(10), "this is not a surf board");
         
        sb.name = "aoag aoara";
         
        System.out.println("start calling get...");
        System.out.println(map.get(sb) != null);
        System.out.println("finish calling get...");
         
         
    }
}

