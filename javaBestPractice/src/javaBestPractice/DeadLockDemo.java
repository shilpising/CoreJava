package javaBestPractice;

public class DeadLockDemo {
   static DeadLockDemo deadLockDemo=new DeadLockDemo();
   public void method1() {
	   synchronized(String.class) {
		   System.out.println("Acquired lock on String class");
		      }
	   synchronized(Integer.class) {
		   System.out.println("Acquired lock on Integer class");
	   }
   }
   public void method2() {
	   synchronized(Integer.class) {
		   System.out.println("Acquired lock on Integer class");
	   }
	   synchronized(String.class) {
		   System.out.println("Acquired lock on String class");
		      }
  }
   static DeadLockDemo getDeadLockDemo(){
	   return deadLockDemo;
   }
}
