package javaBestPractice;

public class SampleClassLoader {

	public static void main(String[] args) {
		 ClassLoader loader1=SampleClassLoader.class.getClassLoader();  //line   1
		    try {
				Class.forName("SampleClassLoader", true, loader1);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}         // line  2
	}

}
