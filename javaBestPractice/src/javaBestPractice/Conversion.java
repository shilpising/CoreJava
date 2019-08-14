package javaBestPractice;

import java.util.TreeSet; 

public class Conversion  
{ 
   
	Conversion() {
		
	}
 // 1.overloaded method with primitive formal argument 
 public void method(int i) 
 { 
       
     System.out.println("Primitive type int formal argument :" + i); 
 } 
   
 // overloaded method with reference formal argument 
 public void method(Integer i) 
 { 
       
     System.out.println("Reference type Integer formal argument :" + i); 
 } 
   
 // 2. overloaded method primitive formal argument 
 // and to be invoked for wrapper Object as overloaded method 
 // with wrapper object of same(Long) type as an argument is not  
 // available. 
 public void method(long i) 
 { 
       
     System.out.println("Primitive type long formal argument :" + i); 
 } 
 public void method(float i) 
 { 
       
     System.out.println("Primitive type float formal argument :" + i); 
 } 
 
 
 public static void gfg(String s) 
 {     
     System.out.println("String"); 
 } 
 public static void gfg(Object o) 
 { 
     System.out.println("Object"); 
 } 
 public static void main (String[] args)  
 { 
     Conversion c = new Conversion(); 
       
     // invoking the method with different signature. 
     c.method(10); 
     c.method(new Integer(15)); 
     c.method(new Long(100)); 
       
     // Using short will give, argument mismatch; 
     // possible lossy conversion from int to short 
     // c.method(new Short(15)); 
     Boolean b1 = true; 
     Boolean b2 = true; 
     System.out.print((b1 == b2) + " "); 
     System.out.print(b1.equals(b2));    
     
     gfg(null); 
     
     
     StringBuilder s1 = new StringBuilder("Java"); 
     String s2 = "Love"; 
     s1.append(s2); 
     s1.substring(4); 
     int foundAt = s1.indexOf(s2); 
     System.out.println(foundAt);
   
     TreeSet<String> treeSet = new TreeSet<>(); 
     
     treeSet.add("Geeks"); 
     treeSet.add("for"); 
     treeSet.add("Geeks"); 
     treeSet.add("GeeksforGeeks"); 

     for (String temp : treeSet) 
         System.out.printf(temp + " "); 

     System.out.println("\n"); 
     
 } 
} 

