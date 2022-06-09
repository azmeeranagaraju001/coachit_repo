package Java.test;

public class Patternquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int n=5; //n=0, n=1, n=8
		
		for(int i=0; i<=n; i++) {
			
			System.out.print("* "); // println =****** //print=* *(wegiven space *)
		} 
		*/
		
		
		
		/*int n=7;
		
		for(int h=1; h<n; h++) {
			for(int k=1; k<n; k++) {
				System.out.print(" * ");
			}
			System.out.println();
		} */
		
		/*int n=5;// increase triangle
		
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		} */
		 
		/*int n=5;// decrease triangle
		
		for(int d=1; d<=n; d++) {
			for(int e=d; e<=n; e++) {
				System.out.print("x ");
			}
			System.out.println();
		}
		*/
       // right triangle(decrease increase)
		
	/*	int n=5;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}

			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	
	*/
	
	  /*	// right triangle(increase decrease)
	
		int n=5;
		
		for(int h=1; h<=n; h++) {
			for(int x=1; x<=h; x++) {
			System.out.print("  ");
			}
		
		for(int g=h; g<=n; g++) {
			System.out.print("* ");
		}
		
		System.out.println();
		}
		*/
		
		
     
    /*  //hill triangle (decrease increase increase) 
         int n=5;
       for(int i=1; i<=n; i++) {
    	   for(int j=i; j<=n; j++) {
    		   System.out.print("  "); // double space
    	   }
    	   
    	   for(int j=1; j<i; j++) { // = remove
    		   System.out.print("* "); // after * one space
    	   }
    	   
    	   for(int j=1; j<=i; j++) {
    		   System.out.print("* ");// after * one space
    	   }
    	   System.out.println();
       }
      */ 
	   
	/*	// return hill traingle(increase increase drecrease)
	int n=5;
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("  ");
		}
        for(int j=i; j<n; j++) {
        	System.out.print("* ");
        }	
		for(int j=i; j<=n; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	*/
/* // diamond pattern
	 int n=5;
     for(int i=1; i<n; i++) {
  	   for(int j=i; j<=n; j++) {
  		   System.out.print("  "); // double space
  	   }
  	   
  	   for(int j=1; j<i; j++) { // = remove
  		   System.out.print("* "); // after * one space
  	   }
  	   
  	   for(int j=1; j<=i; j++) {
  		   System.out.print("* ");// after * one space
  	   }
  	   System.out.println();
     }
    
 	for(int i=1; i<=n; i++) {
 		for(int j=1; j<=i; j++) {
 			System.out.print("  ");
 		}
         for(int j=i; j<n; j++) {
         	System.out.print("* ");
         }	
 		for(int j=i; j<=n; j++) {
 			System.out.print("* ");
 		}
 		System.out.println();
 	}
 	
	*/
	
		int n=4;
		for(int i=1; i<=n; i++) {
			
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(" ");
		   }
		for(int j=i; j<=n; j++) {
			System.out.print("* ");
		   }
		   System.out.println();
		
		}
		
		
		/* int n=5;
		  for(int i=1; i<=n; i++) {
			  for(int j=1; j<=n; j++) {
				  System.out.print("A ");
			  }
			  System.out.println();
		  }
	*/
	
		/*  int n=5;
		  for(int i=1, p='A'; i<=n; i++, p++) {
			  for(int j=1; j<=i; j++) {
				  System.out.print((char)p+" ");
			  }
			  System.out.println();
		  }
	*/
		  
		/*  int n=5;
		  for(int i=1, p='E'; i<=n; i++, p--) {
			  for(int j=1; j<=i; j++) {
				  System.out.print((char)p+" ");
			  }
			  System.out.println();
		  }
		
		*/
		/*	 int n=5;
	
		for(int i=1, p='A'; i<=n; i++, p+=2) {
			for(int j=1; j<=i; j++) {
				System.out.print((char)p);
			}
			System.out.println();
		}
		*/
		
		/*int n=5;
		
		for(int k=1; k<=n; k++) {
			for(int g=1; g<=k; g++) {
				if(k%2==0) {
				System.out.print("A ");
				} 
				else
					System.out.print("B ");
			}
			System.out.println();
		}
		*/
	/*	
		int n=5;
		
		for(int i=1; i<n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("  ");
			}for(int j=1; j<i; j++) {
				System.out.print("* ");
			}for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
		
			System.out.println();
		
		}
		
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}for(int j=i; j<n; j++) {
				System.out.print("* ");
			}for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
		
			System.out.println();
		
		}
		*/
		
		
		
		
		
	
	}
	
	
	

}
