import java.util.*;
public class ProgramInternTax {
public static void main(String[] args) {
	System.out.println("    Tax Calculator App");
	System.out.print("---------");
	System.out.print("WELCOME");
	System.out.println("----------");
	
	System.out.println("Enter Total Person Count:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	String[] name=new String[a];
	long[] income=new long[a];
	for(int i=0;i<a;i++) {
		System.out.println("Enter name "+i+1+":");
		String b=sc.next();
		
		name[i]=b;
		System.out.println("Enter"+" "+ name[i] +" "+"Annual Income:");
		income[i]=sc.nextLong();
		System.out.println();
	}
	System.out.println("   Names with liable taxes");
	System.out.println("------------------------------");
	long tax=0;
	for(int i=0;i<a;i++) {
		if(income[i]>=300000) {
			tax=(income[i]*20)/100;
			
		}
		else if(income[i]>=100000&&income[i]<300000) {
			tax=(income[i]*10)/100;
			
		}
		else {
			System.out.println("0");
		}
		System.out.print(name[i]+":");
		System.out.println(tax+"/-");
	}
	
	
	sc.close();
}
}
