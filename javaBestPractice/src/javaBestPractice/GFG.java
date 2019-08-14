package javaBestPractice;

//Java code to explain effect of Reflection
//on Singleton property

import java.lang.reflect.Constructor;


//Singleton class
class SingletonReflect 
{
	// public instance initialized when loading the class
	public static SingletonReflect instance = new SingletonReflect();
	
	private SingletonReflect() 
	{
		// private constructor
	}
}

public class GFG 
{

	public static void main(String[] args)
	{
		SingletonReflect instance1 = SingletonReflect.instance;
		SingletonReflect instance2 = null;
		try
		{
			Constructor[] constructors = 
					SingletonReflect.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) 
			{
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instance2 = (SingletonReflect) constructor.newInstance();
				break;
			}
		}
	
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	System.out.println("instance1.hashCode():- "
									+ instance1.hashCode());
	System.out.println("instance2.hashCode():- "
									+ instance2.hashCode());
	
	
	
	CFGEnum inst1 = CFGEnum.INSTANCE;
	CFGEnum inst2 = null;
	try
	{
		Constructor[] constructors = 
				CFGEnum.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) 
		{
			// Below code will destroy the singleton pattern
			constructor.setAccessible(true);
			inst2 = (CFGEnum) constructor.newInstance();
			break;
		}
	}

	catch (Exception e) 
	{
		e.printStackTrace();
	}
	
	System.out.println("inst1.hashCode():- "
									+ inst1.hashCode());
	System.out.println("inst2.hashCode():- "
									+ inst2.hashCode());
}
}
