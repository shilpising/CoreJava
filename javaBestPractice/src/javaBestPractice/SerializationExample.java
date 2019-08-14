package javaBestPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class TestPaper implements Serializable{
	/**
	 * 
	 */
	//private static final long serialVersionUID = -6481538364634724925L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 5;
	
	int count;
	String paper;
	static int num;

	public static int getNum() {
		return num;
	}

	public String getPaper() {
		return paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}

	public TestPaper(int count) {
		super();
		this.count = count;
		paper="shilpi";
		num=7;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
class Paper implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -314920153714316152L;
	String type;
	String color;
	TestPaper testPaper;
	transient boolean wet=false;
	static boolean plastic=false;
	
	public Paper() {
		System.out.println("default Paper called");
	}
	public Paper(String type, String color,int count) {
		super();
		this.type = type;
		this.color = color;
		testPaper=new TestPaper(count);
		
	}
	public Paper(String type, String color,int count, boolean wet) {
		super();
		this.type = type;
		this.color = color;
		this.wet = wet;
		plastic=true;
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
	public int getTestPaper() {
		return testPaper.getCount();
	}
	public void setTestPaper(TestPaper testPaper) {
		this.testPaper = testPaper;
	}
	public static boolean isPlastic() {
		return plastic;
	}
	public static void setPlastic(boolean plastic) {
		Paper.plastic = plastic;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public boolean isWet() {
		return wet;
	}
	public void setWet(boolean wet) {
		this.wet = wet;
	}
	
}
public class SerializationExample {

	public static void main(String[] args) throws IOException {
		
		/*Paper col=new Paper("A4","Red",2,true);
		Paper col1=new Paper("A4","Red",2);
		//// Serialization code
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("paper.ser"));
		try {
			out.writeObject(col1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			out.close();
		}
		System.out.println("Col1 Object:   "+col1.getColor()+" , "+col1.getType()+" , "+col1.getTestPaper());
		//System.out.println("Col Object:   "+col.getColor()+" , "+col.getType()+" , "+col.isWet()+" , "+col.isPlastic());
	//// De-Serialization code
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("paper.ser"));
		try {
			Paper paperIn=(Paper)in.readObject();
			System.out.println("\n\n De-Serialization code");
		//System.out.println("paperIn Object:   "+paperIn.getColor()+" , "+paperIn.getType()+" , "+paperIn.getTestPaper());
			System.out.println("paperIn Object:   "+paperIn.getColor()+" , "+paperIn.getType()+" , "+paperIn.isWet()+
					" , "+paperIn.isPlastic()+" , "+paperIn.getTestPaper());
			in.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*TestPaper testPaper=new TestPaper(55);
	//// Serialization code
			ObjectOutputStream tout=new ObjectOutputStream(new FileOutputStream("testPaper.ser"));
			try {
				tout.writeObject(testPaper);
				System.out.println("paperIn Object:   "+testPaper.getCount()+" , "+ testPaper.getPaper());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				tout.close();
			}*/
			
		
		
	}

}
