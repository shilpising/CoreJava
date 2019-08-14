package javaBestPractice;

import java.util.Scanner;

public class XorNumber {
	
	/**Given a 2-D array of order N X M array elements, the task is to check if we can select a number
	 *  from every row in such a way that xor of the selected numbers is greater than 0.
	 * @param args
	 */
	
	public static boolean check(int a[][]) {
		int xorr = 0; 
		
		// Find the xor of first 
        // column for every row 
        for (int i = 0; i <a.length; i++) 
        { 
            xorr ^= a[i] [0]; 
        } 
      
        // If Xorr is 0 
        if (xorr != 0) 
            return true; 
		for(int r=0;r<a.length;r++ ) {
			for(int col=1;col<a[r].length;col++) {
				if(a[r][0]!=a[r][col]) {
					return true;
				}
				}
		}
		return false;
	}
	public static void main(String[] args) {
		int a[][] = {{7, 7, 7}, 
                {10, 10, 7}} ;
		
		/*int a[][] = {{1, 1, 1},
                {1, 1, 1}, 
                {1, 1, 1}, 
                {1, 1, 1}} ;*/
		
		//System.out.println(check(a));
		Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt(); // read an integer from input stream.
        int c = scanner.nextInt(); 
        int[][] b=null;
        for(int i=0; i<r;i++) {
        	//for(int j=0;j<c;j++) {
        		String one = scanner.nextLine();
        		String[] split=one.split(" ");
        		for(int k=0;k<split.length;k++) {
        			b[i][k]=Integer.valueOf(split[k]);
        		}
        	//}
        }
        System.out.println(b);
        
	}

}
