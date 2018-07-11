package javaBestPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Color {
	/**
	 * 
	 */
	private static final long serialVersionUID = -314920153714316152L;
	String type;
	String color;
	
	public Color() {
		System.out.println("inside super");
	}
	public Color(String type, String color) {
		super();
		System.out.println("inside super1");
		this.type = type;
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}

class PaperColor extends Color implements Serializable{
	boolean isPaper;

	public PaperColor() {
		System.out.println("inside child");
	}
	public PaperColor(String col, String type,boolean isPaper) {
		super(col,type);
		System.out.println("inside child1");
		this.isPaper = isPaper;
	}
	public boolean isPaper() {
		return isPaper;
	}
	public void setPaper(boolean isPaper) {
		this.isPaper = isPaper;
	}
	
	
}
public class SerializationSuperClassExample {

	public static void main(String[] args) throws IOException {
		
		PaperColor col=new PaperColor("A4","Red",true);
		
		//// Serialization code
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("paperCol.ser"));
		try {
			out.writeObject(col);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			out.close();
		}
		System.out.println("Col Object:   "+col.getColor()+" , "+col.getType()+" , "+col.isPaper());
		
	//// De-Serialization code
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("paperCol.ser"));
		try {
			PaperColor paperIn=(PaperColor)in.readObject();
			System.out.println("paperIn Object:   "+paperIn.getColor()+" , "+paperIn.getType()+" , "+paperIn.isPaper());
			in.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
