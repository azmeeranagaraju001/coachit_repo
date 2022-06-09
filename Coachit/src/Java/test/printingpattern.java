package 
Java.test;

import java.util.Scanner;

public class printingpattern {

	public static void main(String[] args) {
    
	 Scanner sc =new Scanner(System.in);
		System.out.println("enter number in 3 numbers");
		
		
		
		
		
		int a=sc.nextInt();
			
		int b=sc.nextInt();
			
		int c=sc.nextInt();
		
		
		if (a>b && a<c ) {
			System.out.println("a");
			
		}
		else if (b<c) {
			System.out.println("b");
		}
		else  {
			System.out.println("c");
		}
		
	}

}
