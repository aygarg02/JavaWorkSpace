package conditionalStatement;

public class NestedIfElseStatement {
	public static void main(String[] args) {
//		to find greater of  three number
		int a=1000;
		int b=200;
		int c=30;
		int result=0;
		if(a>b) {
			if(a>c) {
				System.out.println("A is largest of three number");}
				else 
				{
					System.out.println("C is largest of three number");
				}
				
			}
		else {
			if(b>c) {
				System.out.println("B is largest of three number");}
				else 
				{
					System.out.println("C is largest of three number");
				}
			
			
			
	
		}
		
//	ternary operators nesting can occur
		result=a>b?a>c?a:c:b>c?b:c;
		System.out.println(result);
	
	
	}
	
		
		
		
		
		
		
		
		
	}


