package operators;

public class ArithmaticOperators {
	public static void main(String[] args) {
		int a=44;
		int b=23;
//		important very .............................
		double c=(double)a/(double)b;
//		double c =a/b try ...
		int d=a%b;
//		......................................._________
		int e=b++;
//		in b++ this is divided into 2 parts 1st is b value goes to c and then b value increases by 1
//		where as in ++b the value of b increases and then it store in the c 
		int f=++b;
		System.out.println(e+"  "+b);
		System.out.println(f+"  "+b);
		
		System.out.println(c);
		System.out.println(d);
		
//	various arithmetic operators
//		+
//		-
//		*
//		/
//		%
//		++
//		--
		
		
		
		
		
	}

}
