package dSA;

public class Swap {
public static void main(String[] args) {
	int a=5;
	int b=40;
//	int c=a;
//	a=b;
//	b=c;
	
//	without using the 3rd variable
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println(a+" "+b);
}
}
