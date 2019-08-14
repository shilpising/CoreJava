package javaBestPractice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector; /* Line 2 */
class MyVector extends Vector 
{
    int i = 1; /* Line 5 */
     int j[];
    public MyVector() 
    { 
        i = 2; 
    } 
} 
public class MyNewVector extends MyVector 
{
    public MyNewVector () 
    { 
        i = 4; /* Line 15 */
    } 
    public static void main (String args []) 
    { 
        MyVector v = new MyNewVector(); /* Line 19 */
       // System.out.println(v.j);
        
       /* Object i = new ArrayList().iterator(); 
        System.out.print((i instanceof List)+","); 
        System.out.print((i instanceof Iterator)+","); 
        System.out.print(i instanceof ListIterator); */
        Object x = new Vector().elements(); 
        System.out.print((x instanceof Enumeration)+","); 
        System.out.print((x instanceof Iterator)+","); 
        System.out.print(x instanceof ListIterator); 
    } 
    
    
}