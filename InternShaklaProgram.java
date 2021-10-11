import java.util.Scanner;

public class InternShaklaProgram {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	     System.out.println("enter your name");
	String name=sc.nextLine();
	     System.out.println("enter your age");
	int age=sc.nextInt();
	sc.nextLine();
	     System.out.println("enter your blood group");
      String group="null";
	    String bloodg=sc.nextLine();
	if(age>=10 && age<15)group="Yellow";
	else if(age>=15 && age<20)group="BLUE";
	else if(age>=20)group="RED";
//	final display of output
	   System.out.println("----------------------------------");
	   System.out.print(" ");
	   System.out.println("Name:"+name);
	   System.out.print(" ");
	   System.out.println("Age: "+age);
	   System.out.print(" ");
	   System.out.println("Blood Group: "+bloodg);
	
	System.out.println("----------------------------------");
	System.out.print(" ");
	System.out.println("Your Group is "+group);
	System.out.println("----------------------------------");
	}

}
