package javaBestPractice;

class Animal1{
	public void speak() throws NoSuchFieldException{
	//public void speak() throws NullPointerException{
	//public void speak() throws Exception{
	//public void speak(){
			System.out.println("I am an  Animal");
	}
	void run(){
			System.out.println("Animal is running");
	}
}

class Dog extends Animal1 {
 	public void speak() throws NullPointerException{
	//public void speak() throws NoSuchFieldException{
	//public void speak() throws Exception{
	//public void speak() {
			System.out.println("I am a Dog");
	}
}

class SampleOverriding{
	public static void main(String args[]){
		try{
		Animal1 aniobj=new Dog();
		aniobj.speak();
		aniobj.run();

	}
	catch (Exception e){}
	}
}

/* Note: Identify the error, rectify the same and get the output. */