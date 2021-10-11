//in non primitive we do not assign the value we give the reference of object variable to  the the method like a is referenced as aysuh1 but on swaping the value of a and b is interchanged but the ayush1 and ayush2 remain same 
//but on changing the value of a and b value of ayush 1 and ayush 2 will change as address is refrenced (means a is referenced to same address as ayush1 )
package oOOPS;



public class PassByVlaue3Non {
public static void main(String[] args) {
	ayush ayush1=new ayush();
	ayush1.age=200;
	ayush ayush2=new ayush();
	
	ayush1.age=2;
	swap(ayush1,ayush2);
	System.out.println(ayush1.age);
}
static void swap(ayush a,ayush b) {
	ayush temp=a;
	a.age=20;
	a=b;
	b=temp;
	
}

}

class ayush{
	int age=20;
}
