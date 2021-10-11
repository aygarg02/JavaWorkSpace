package conditionalStatement;
import java.util.Scanner;

public class ElseIfStatement {

	public static void main(String[] args) {
//		find out the range of numbers
		int a=19;
		if(0<a && a<10) {
			System.out.println("range from 0 to 10");
					 
		}
		else if(10<a && a<20) {
			System.out.println("range from 0  to 20");
			
			
		}
		else if(20<a && a<30) {
			System.out.println("range from 0  to 30");
			
		}
		else {
			System.out.println("out of range");
		}
		Scanner sc=new Scanner(System.in);
	int aa =sc.nextInt();
	int c=sc.nextInt();
//	short form of if else statement
	int op=aa>c?aa:c;
	System.out.println("the greater number is"+op);
	}
	

}
