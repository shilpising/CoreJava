/*class A //implements Cloneable
{
    //member attributes and methods
	public Object clone() {
		return this;
	}
}
 
class B
{
	B(){
    A a = new A();
    if(a instanceof Cloneable)
    {
        //A copied = (A) a.clone(); //I should be able to do this; But I am not.
    }
	}
}*/

class Base extends Exception {
	protected int name;
}
class Derived extends Base  {}
public class A<T>{
	public static void main(String args[]) {
		   // some other stuff
		   try {
		       // Some monitored code
			   
			   A a=new T();
		       throw new Derived();
		    }
		    catch(Base b)     { 
		       System.out.println("Caught base class exception"); 
		    }
		    catch(Derived d)  { 
		       System.out.println("Caught derived class exception"); 
		    }
		  }
}

class Test extends Exception { }
