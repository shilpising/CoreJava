package javaBestPractice;

import java.io.IOException;

public class LeftRotation {
	 // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	for(int i=0;i<d;i++) {
    		int temp=a[0];
    		int j;
    		for(j=0;(j<a.length && !(j+1 >=a.length));j++) {
    			a[j]=a[j+1];
    		}
    		a[j]=temp;
    	}

    	return a;
    }

   
    public static void main(String[] args) throws IOException {
        int d = 4;//Integer.parseInt(nd[1]);

       int[] b = {1,2,3,4,5};//new int[n];
        int[] a= {33,47,70,37,8,53,13,93,71,72,51,100,60,87,97};

        int[] result = rotLeft(a, 13);
        for(int i=0;i<result.length;i++) {
        	System.out.print(result[i]+" ");
        }
        System.out.println();
        int[] result1 = rotLeft(b, d);
        for(int i=0;i<result1.length;i++) {
        	System.out.print(result1[i]+" ");
        }
    }
}
