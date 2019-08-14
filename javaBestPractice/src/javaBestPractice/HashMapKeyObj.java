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
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
		return name.length();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyObj other = (KeyObj) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
		KeyObj temp=(KeyObj) obj;
		return this.name.equals(temp.name);
	}*/
	
	public int hashCode() {
		return name.length();
	}
	
	public boolean equals(Object obj) {
		KeyObj temp=(KeyObj) obj;
		return this.name.equals(temp.name);
	}
	
}
public class HashMapKeyObj {

	public static void main(String[] args) {
		KeyObj obj1=new KeyObj("abc");
		KeyObj obj2=new KeyObj("abc");
		
		Map<KeyObj,Integer> map1=new HashMap<>();
		System.out.println("before put");
		map1.put(obj1, 1);
		/*obj1.name="defg";
		map1.put(obj1, 2);*/
		map1.put(obj2, 3);
		map1.put(new KeyObj("def"), 7);
		System.out.println(map1.size());
		System.out.println(map1);
		System.out.println(map1.get(obj1));
		obj1.name="abc";
		System.out.println(map1.get(obj1));
	/*	String a=new String("abc");
		String b=new String("abc");
		Map<String,Integer> map=new HashMap<>();
		map.put(a, 21);
		map.put(b, 26);
		a=new String("def");
		map.put(a, 35);
		//System.out.println(a.hashCode());
		//System.out.println(b.hashCode());
		System.out.println(map);
		System.out.println(map.get(a));
		System.out.println(map.get("abc"));*/
	}

}
