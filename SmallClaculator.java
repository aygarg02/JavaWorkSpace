import java.util.*;
public class SmallClaculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();	
int c=a+b;
System.out.println("Add: "+c);
int d=a-b;
System.out.println("Sub: "+d);
if(b==0)System.out.println("Div not allowed as b is 0");
else {int e=a/b;System.out.println("Div: "+e);}

int f=a*b;
System.out.println("MUl: "+f);
	sc.close();
	
	
	
	
	
}
}
