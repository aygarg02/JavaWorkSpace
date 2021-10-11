import java.util.*;
public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String b=null;
		char[] aa=new char[3];
		int a=sc.nextInt();
		if(a>=100 && a<=999) {
		 b=Integer.toString(a);
		for(int i=0;i<3;i++) {
			int to=2-i;
			aa[to]=b.charAt(i);
		}
		String f=String.valueOf(aa);
		System.out.println(f);
		}
		else {System.out.println("exceed the limit");}
		
		
		
		
		
		sc.close();
	}

}
