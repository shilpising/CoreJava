package javaBestPractice;

import java.util.Calendar;
import java.util.GregorianCalendar;

class CalenderDemo{
	public static void main(String arg[]){
		/* Refer java documentation for more details */

		Calendar calendar=new GregorianCalendar();
		 System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		 System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		 System.out.println("DATE: " + calendar.get(Calendar.DATE));

		 /*
		  * The above statement gives the exact number of the month.
		  *  As get(Calendar.Month) returns month starting from 0, 
		  *  adding 1 to the result would give the correct output. 
		  *  And keep in mind to subtract 1 when setting the month.
		  */
   		Calendar newyear=new GregorianCalendar((calendar.get(Calendar.YEAR)+1),0,1);
		System.out.println("YEAR: " + newyear.get(Calendar.YEAR));
		System.out.println("MONTH: " + newyear.get(Calendar.MONTH));
		System.out.println("DATE: " + newyear.get(Calendar.DATE));
	}
}

/* Note: Analyze the code and understand the output. */
