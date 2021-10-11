//method overloading means same method name with same signature(means same number of parameters of same type )


package oOOPS;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a45 =sc.nextInt();
		int b65 =sc.nextInt();
		int d =sc.nextInt();
	 System.out.println(maxOf(a45,b65));
	 System.out.println(maxOf(d));
	 
sayHi();
	

	}
	 static int  maxOf(int a,int b) {
		
		return a>b?a:b;
	}
	 static float maxOf(float d) {
		 return d;
	 }
	 static void sayHi() {
		 System.out.println("ayush garg ");
//		 simple write the name of fxn to call because print statement is not applicable for void method type
	 }

}
