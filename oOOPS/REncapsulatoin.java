package oOOPS;

import oOOPS.REncapsulation.Access2;
 
public class REncapsulatoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Access2 pass1=new  Access2();
		 Access2 pass2=new  Access2();
		 String a="ayush";
         	pass1.Pass(a);
	   	 pass2.Pass("garg");
		pass1.obj();
	
		System.out.println(pass1.a);
	}

}
//so we came to know that the public means everywhere within the package class ao any environment
//private means within the same class
//if we do not write anything means default within the same package
