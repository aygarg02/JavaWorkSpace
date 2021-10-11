//java work on pass by value not pass by reference
//example of pass by valueon which java works
//it do not give int b of fxn swap an address of e it gives the actual value of b to e as b=20 (after the execution of fxn value delete automatically)so the value of e do not change  
// for the premetive it assign b as 20 a value of e
package oOOPS;

public class PassByValue3 {
public static void main(String[] args) {
	int e=20;
	int c=50;
	swap(e,c);
	System.out.println(c);
}
static void swap(int b,int a) {
	int temp=a;
	a=b;
	b=temp;
	
	
}
}

