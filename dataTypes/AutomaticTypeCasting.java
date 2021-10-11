package dataTypes;
import java.util.Scanner;

public class AutomaticTypeCasting {
	public static void main(String[] args) {
//		there are two type of conversion automatic and manual for automatic the conversion is from byte to short to char to int to long to float to double and boolean can not be converted
//		if there is opposite conversion then we use the manual method 
	Scanner sc=new Scanner(System.in);
	 short x=sc.nextShort();
      int y=x;
//      automatic type conversion as in manner
     double z=sc.nextDouble();
      int q=(int)z;
//     manual type conversion as not in given manner
     System.out.println(q);
     System.out.println(y);
     
     
	
	
}
} 