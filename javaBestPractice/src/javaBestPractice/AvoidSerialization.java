package javaBestPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3298480854914848072L;
	int type;
	public Animal(int type) {
		super();
		this.type = type;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}

class Cat extends Animal {
	String name;
	
	

	public Cat(int type,String n) {
		super(type);
		name=n;
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private void  writeObject(ObjectOutputStream aOutputStream) throws ClassNotFoundException, IOException{
		System.out.println("inside wite");
		throw new NotSerializableException();
	}
	private void  readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException{
		System.out.println("inside read");
		//return this;
		throw new NotSerializableException();
		
	}
	
}
public class AvoidSerialization {

	public static void main(String[] args) {
		
		
		Cat col=new Cat(1,"abc");
	//// Serialization code
			
			try {
				ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("cat.ser"));
				out.writeObject(col);
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("cat Object:   "+col.getName()+" , "+col.getType());
			
		//// De-Serialization code
			
			try {
				ObjectInputStream in=new ObjectInputStream(new FileInputStream("cat.ser"));
				Cat catIn=(Cat)in.readObject();
				System.out.println("cat Object:   "+catIn.getName()+" , "+catIn.getType());
				in.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
