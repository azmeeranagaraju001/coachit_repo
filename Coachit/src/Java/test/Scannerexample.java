package Java.test;

import java.util.Scanner;

public class Scannerexample {

	public static void main(String[] args) {
   		/*Scanner myobj =new Scanner(System.in);
   		System.out.println("Enter name, Age, Salary");
   		
   		// String input
   		String name = myobj.next();
   		
   		//numerical input
   		int Age = myobj.nextInt();
   		double Salary =myobj.nextDouble();
   		
   		//output input by using
   		System.out.println("name="+name);
   		
   		System.out.println("Age="+Age);
   	
   		System.out.println("Salary="+Salary);
   		
   		*/
		
		Scanner s=new Scanner("System.in");
		System.out.println("enter the value a");
		int a=s.nextInt();
		
		System.out.println("enter the value b");
		int b=s.nextInt();
		
		while (a<b);
		{
			System.out.println("the value of is " +a);
					a++;
		}
		
		
		
	}

}
