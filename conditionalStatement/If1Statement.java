package conditionalStatement;

public class IfStatement1 {
	public static void main(String[] ar) {
		int a=152;
//		syntax:
//		if(condition(answer of condition must be boolean so we can use comparison operators or it be  true or false))
//		{
//			block
//		}
		
		if(a<120) {
		if(a>=18) {
			System.out.println("you can vote now ");}
			else {
				System.out.println("you can not vote");
			}
		
		}
		else {
			System.out.println("plz enter a valid age");
		}
//  another if statement example	
		int pattle=404 ;
		if(pattle%2!=0) {
			System.out.println("not try on other");	}
			else if(pattle>18) {
				System.out.println("can try chance is greater than 80% ");
				
				
			}
			
		
		else {
			
			System.out.println("she do !Lucky ");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
