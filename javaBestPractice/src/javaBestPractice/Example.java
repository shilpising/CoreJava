package javaBestPractice;

public class Example {

	public static void main(String[] args) {
		
		//fibonacci
		int n1=0,n2=1,n3=0;
		System.out.print(n2);
		for(int i=0;i<10;i++) {
			n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
		}
		
		//prime nos
		System.out.print("\n Prime numbers----- 2,");
		for(int i=3;i<100;i++) {
			int prime=i;
			boolean notPrime=false;
			for(int j=2;j<10;j++) {
				if(prime%j==0 && prime!=j) {
					notPrime=true;
					j=10;
				}
			}
			if(notPrime==false) {
				System.out.print(prime+",");
			}
			
		}
		
	}

}
