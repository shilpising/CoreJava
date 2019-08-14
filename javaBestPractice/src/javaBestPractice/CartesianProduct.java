package javaBestPractice;

import java.util.HashMap;

public class CartesianProduct {
	
		public static void main(String[] args) {
		int a[]= {1,2};
		int b[]= {3,4};
		HashMap<Integer,Integer> c=new HashMap<Integer,Integer>();
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<b.length;j++) {
				System.out.print("("+a[i]+","+ b[j]+")");
			}
		}
		//System.out.println();
	}

}
