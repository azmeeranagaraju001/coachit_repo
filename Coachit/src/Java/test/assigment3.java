package Java.test;

import java.util.Scanner;

public class assigment3 {

	public static void main(String[] args) {
		 

	
		/*
		 // 1)Find the largest the number and smallest number in the array / input array elements:56, 16, 3, 0, 27 
		   / output:laragest element 56 Smallest number 0
		  
		  int array[]= {56,16,3,0,27};
	  int large=array[0];
	  int small=array[0];
	  
	 for(int i=1; i<array.length; i++) {
		 
		 if(array[i]>large) {
			 
			  large=array[i];
		 }
		 else if(array[i]<small) { 
		      small=array[i];
		 }
		 
	 }
	 
	     System.out.println(large);
		  System.out.println(small);
	*/	  
		  
		   
		/*	//Q=4 L pattern
			int w=5;
			for(int i=1; i<w; i++) {
				System.out.println("*");
			}

			for(int k=1; k<=w; k++) {
				System.out.print("* ");
			}
			*/
	 /* //5) triangle pattern
		Scanner sc=new Scanner(System.in);
		System.out.println("input value"); 
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if((i%2)==1) {
				for(int j=1; j<=i; j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
	*/
		 int n=5;
		  for(int i=1, p='A'; i<=n; i++, p++) {
			  for(int j=1; j<=i; j++) {
				  System.out.print((char)p+" ");
			  }
			  System.out.println();
		  }
		
	
	}
  }
 
