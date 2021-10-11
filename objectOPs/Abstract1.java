package objectOPs;

public class Abstract1 {
  
	public static void main(String[] args) {
		new animal(); 
		
		
	}
}
abstract class animal{
//	we can not make a object of this class as  to hide redundant information
	abstract void eat();
	 void talk() {
		 System.out.println("enter hare");
	 };
	
	
}
class dog extends animal{
	@Override
void eat() {
	System.out.println("hi");
}
	
	
}