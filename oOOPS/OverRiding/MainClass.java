package oOOPS.OverRiding;

public class MainClass {

	public static void main(String[] args) {
		Dog d=new Dog();
		

//	method overriding 
//	same method in class and subclass  with same signature
//	so the subclass will retain its own method not the method of parent class
//	pet ma bhi dog ka dalana ha dog ka method then we use	
//	Pet p=d;

	d.walk();
	Pet p1=d;
	p1.walks();
	p1.walk();/*instead of pet walk it use dog walk*/

//	trial purpose ka liya ...
	
	d.talk();
	p1.talk();
//	mip to be noted the that field can not be override
	System.out.println(p1.name);
	System.out.println(d.name);
        
		
	}

}
//override ka mtlb iski bajaya isa istamal karna hota ha 
//method overriding 
//same method in class and subclass  with same signature
//so the subclass will retain its own method not the method of parent class
//if we use down casting then
//then the parent class method having same name as child class
//for both p and d if we call that method same name the method in the dog will ececute for the both i.e down casting not for the case in variable
//other function of p will work like as declared in p
//that method will override with the method of child class
//we can use the other method method parent class also
//most imp point
//in down casting 
//the variable or field with same declaration or name does not override
//different value  for pet as declared in pet and for dog 