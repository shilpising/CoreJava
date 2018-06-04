package javaBestPractice;

import java.util.HashMap;
import java.util.Map;

class KeyObj{
	String name;
	KeyObj(String n){
		name=n;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class HashMapKeyObj {

	public static void main(String[] args) {
		KeyObj obj1=new KeyObj("abc");
		KeyObj obj2=new KeyObj("abc");
		Map map=new HashMap();
		map.put(obj1.getName(), 1);
		map.put(obj2.getName(), 2);
		System.out.println(map.size());
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.getName().hashCode());
		System.out.println(obj2.getName().hashCode());
	}

}
