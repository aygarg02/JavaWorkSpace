package conditionalStatement;

import java.util.Scanner;



public class SwitchCal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	double a=sc.nextInt();
	System.out.println("enter  no");
	double b=sc.nextInt();
	System.out.println("enter thr operation");
	sc.nextLine();
	char operation=sc.nextLine().charAt(0);
double result=0;
switch(operation) {
case '+':
	result= a+b;
	break;
	
case '-':
	result= a-b;
	break;
	
case '*':
	result=a*b;
	
	break;
case '/':
	result=(double)a/(double)b;
	
	break;
default:
	System.out.println(" not passible");
	
}
System.out.println(result);
}

	

}

