package dataTypes;
import java.util.Scanner;

public class SimpleIntrestCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int prin=sc.nextInt();
         float rate=sc.nextFloat();
         int time=sc.nextInt();
         float act=prin*rate*time/100;
         System.out.println("The simple intreast is"+act);
        		 
		
		
	}

}
