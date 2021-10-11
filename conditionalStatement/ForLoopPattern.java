package conditionalStatement;

import java.util.Scanner;

public class PatternForLoop {
	public static void main(String[] aa) {
		Scanner sc=new Scanner(System.in);
//		pattern 
//BOK OF NXN MATRIK......
//		for(int k=0;k<5;k++) {
//		for(int i=0;i<5;i++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//		}
//right angle triangle......... 
//		for(int k=1;k<=5;k++) {
//	   for(int i=0;i<k;i++) {
//		   System.out.print("* ");
//		
//	   }System.out.println();
//	   }
//ULTI with gap right angle triangle............
//		int n=sc.nextInt();
//		for(int k=0;k<=n;k++) {
//			   for(int i=0;i<=k-1;i++) {
//				  
//				   System.out.print("  ");
//
//			   }
//			   System.out.println();
//			   
//					  
//			   for(int i=0;i<=n-k+1;i++) {
//				   System.out.print("* ");
//				 
//				   
//
//			   }
//	
//			   }
//	System.out.println("ayush garg");
//	}
//ulti triangle......
//		for(int i=5;i>=1;i--) {
//			for(int j=0;j<i;j++) {
//				
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//			
//		}
//triangle sidhi......
//		int n=sc.nextInt();
//		for(int i=n;i>=1;i--) {
//		for(int j=0;j<i;j++) {	
//			System.out.print("  ");
//		}
//		for(int j=0;j<=n-i;j++) {
//			System.out.print("* ");
//			
//			}
//		System.out.println();
//		}
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
		for(int j=0;j<i;j++) {
			System.out.print(" ");	
		}
		for(int j=0;j<=n-i;j++) {
			System.out.print("* ");	
		}
		System.out.println();

		}		
		
	
	}
}
