package Java.test;

import java.util.Scanner;

public class Scan_while {

	public static void main(String[] args) {
		

		Scanner s=new Scanner(System.in);
		System.out.println("enter the value a:");
		int a=s.nextInt();
		
		System.out.println("enter the value b:");
		int b=s.nextInt();
		
		while (a<b);
		{
			System.out.println("the value of is :" +a);
					a++;
		}
		
	}

}
