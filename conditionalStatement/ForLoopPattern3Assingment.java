package conditionalStatement;

import java.util.Scanner;

public class ForLoopPattern3Assingment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//1st question answer........
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<i;j++) {
//			System.out.print(" ");
//		}
//		for(int j=n;j>i-1;j--) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//	}
//Q2: moving triangle like str.......
//     for(int i=1;i<=n;i++) {
//    	 for(int j=1;j<i;j++) {
//    		 System.out.print("  ");
//    		 
//    	 }
//    	 for(int j=n;j>i-1;j--) {
//    		 System.out.print("*");
//    	 }
//    	 System.out.println(); 
//     }
//Q3:space vali trangle
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=2*(n-i);j++) {
//			System.out.print(" ");
//		}
//		for(int j=1;j<=i;j++) {
//			System.out.print("*   ");
//		}
//		System.out.println();
//	}
//	wrong....
//		int n=sc.nextInt();
//		int a=n-1;
//		for(int i=1;i<=a;i++) {
//			for(int j=1;j<=2*(n-i);j++) {
//				
//				if(i>n) {break;}
//				System.out.print(" ");
//				}
//                 for(int j=1;j<=i;j++) {
//				
//				if(i>n) {break;}
//				System.out.print("* ");
//				}
//			
//					for(int k=1;k<=2*(i-n);k++) {
//						System.out.print(" ");
//					}
//					if(i>n) {
//					  for(int j=n-1;j>=i-n;j--) {
//						  System.out.print("* ");	
//					}}
//							
//							System.out.println();
//							}
//	
//Q5:window type...		
//		int n=sc.nextInt();		
//		for(int i=1;i<=n;i++) {
//			
//			
//			for(int j=n;j>=i;j--) {
//				System.out.print("*");
//			                     }
//			for(int j=1;j<=i;j++) {
//				System.out.print("  ");
//			                     }
//			for(int j=n;j>=i;j--) {
//				System.out.print("*");
//			                     }
//			
//			System.out.println();
//		                      }
//		System.out.println();
//		
//	for(int i=1;i<=n;i++) {
//			
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			                     }
//			for(int j=n;j>=i;j--) {
//				System.out.print("  ");
//			                     }
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			                     }
//			
//			System.out.println();
//		
//	}
//	Q6.NUMBER pyramid...
//		int n=sc.nextInt();	
//		int num=0;
//	for(int i=1;i<=n;i++) {	
//		for(int j=1;j<=n-i;j++) {
//			
//			System.out.print(" ");
//		}
//		for(int j=1;j<=i+num;j++) {
//			System.out.print(j);
//			if(num-1>n) {break;}
//			
//			
//		}
//		
//		num++;
//		System.out.println();
//		
//		
//	}
//	Q7.center 0 vali triangle..... 
//		int n=sc.nextInt();	
//		int num=1;
//	for(int i=1;i<=n;i++) {
//		
//		for(int j=1;j<=n-i;j++) {
//			    System.out.print(" ");        
//		                      }
//		System.out.print(i);
//	if(i>=2) {
//		for(int j=1;j<=2*(i-1)-1;j++) {
//		    System.out.print("0");        
//	                      }
//	
//		System.out.print(i);
//	}
//		System.out.println();
//	                      }
//	
//	triangle......
//		int n=sc.nextInt();	
//for(int i=1;i<=n;i++) {
//	for(int j=1;j<=n-i;j++) {
//		System.out.print(" ");
//	}
//	{
//		System.out.print("*");
//		for(int j=1;j<i;j++) {
//			System.out.print("**");
//		}	
//	}
//	System.out.println();
//}	
		int n=sc.nextInt();	
for(int i=1;i<=n;i++) {
	System.out.print("*");
	for(int j=1;j<=i-2;j++) {
		if(n==i) {break;}
		System.out.print(" ");
	}
	if(!(i==1 || i==5)) {
	System.out.print("*");}
	if(i==n) { 
		for(int j=1;j<n;j++) {
		System.out.print("*");}
	}
	System.out.println();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	}



