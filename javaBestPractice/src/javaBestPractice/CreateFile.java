package javaBestPractice;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		boolean newFile=false;
		File  file=new File("help.txt");
		try {
			file.createNewFile();
			newFile=file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("file exists  "+ file.exists());
		System.out.println("file exists  "+ newFile);

	}

}
