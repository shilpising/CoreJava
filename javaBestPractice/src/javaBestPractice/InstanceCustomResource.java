package javaBestPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class CustomResource implements AutoCloseable{
	String n;
	CustomResource(String n){
		this.n=n;
	}
	
	public void fetchResource() {
		System.out.println("REsource--- "+n);
	}
	public void close() throws Exception{
		System.out.println("Closing resource");
	}
	
}
public class InstanceCustomResource {

	public static void main(String[] args) {
		try(CustomResource obj=new CustomResource("abc");BufferedReader b1=new BufferedReader(new FileReader("D:/temp.txt"))
				;BufferedWriter b2=new BufferedWriter (new FileWriter("D:/temp.txt"));){
			obj.fetchResource();
		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
