package javaBestPractice;

import java.util.ArrayList;
import java.util.List;

public class StaticBindingTest {
	  
    public static void main(String args[])  {
       /*Collection c = new HashSet();
       StaticBindingTest et = new StaticBindingTest();
       et.sort(c);*/
    	
    	List<Integer> i=new ArrayList<Integer>();
    	i.add(5);
    	i.add(50);
    	show(i);
      System.out.println(i);
      
      String str="shilpi";
      show(str);
      System.out.println(str);
      
      Abc obj=new Abc();
      System.out.println(obj.getI());
      show(obj);
      System.out.println(obj.getI());
      
      Integer n=new Integer(100);
      Integer m=100;
      Integer o=100;
      System.out.println(n==m);
      System.out.println(o==m);
    }

	private static void show(List<Integer> i) {
		i.add(67);
		
	}
	
	private static void show(String str) {
		//str=null;
		str="abc";
	}
	
	private static void show(Object obj) {
		Abc a=(Abc)obj;
		a.setI(100);
		
	}
   
    /*//overloaded method takes Collection argument
    public Collection sort(Collection c){
        System.out.println("Inside Collection sort method");
        return c;
    }
  
   
   //another overloaded method which takes HashSet argument which is sub class
    public Collection sort(HashSet hs){
        System.out.println("Inside HashSet sort method");
        return hs;
    }*/
      
}