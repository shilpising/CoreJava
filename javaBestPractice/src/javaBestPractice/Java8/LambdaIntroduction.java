package javaBestPractice.Java8;


import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.function.Predicate;

public class LambdaIntroduction {
	 public static void main (String[] ar){
		 EmployeeLambda[] employees  = {
             new EmployeeLambda("David"),
             new EmployeeLambda("Naveen"),
             new EmployeeLambda("Alex"),
             new EmployeeLambda("Richard")};
           
         System.out.println("Before Sorting Names: "+Arrays.toString(employees));
         Arrays.sort(employees, EmployeeLambda::nameCompare);
         System.out.println("After Sorting Names "+Arrays.toString(employees));
         
         FileFilter filter = (File f) -> { return f.isFile(); };
         Object predicate = (FileFilter) (File f) -> { return f.isFile(); };
         filter = (FileFilter) predicate;//Type mismatch: cannot convert from Predicate<File> to FileFilter
         //cannot be cast to java.io.FileFilter
     }
}
 
class EmployeeLambda {
 String name;
 
 EmployeeLambda(String name) {
   this.name = name;
 }
 
 public static int nameCompare(EmployeeLambda a1, EmployeeLambda a2) {
   return a1.name.compareTo(a2.name);
 }
   
 public String toString() {
   return name;
 }
}