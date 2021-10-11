//not able to understand protected
// to inherit the class we use extends keyword
//multiple inheritance is not allowed
//hierarchical inheritance is allowed
//method overriding is allowed(same method in parent and child then child will run)
//

package oOOPS;

import oOOPS.Inheritance.Person;


public class UInheritance extends Person  {

	public static void main(String[] args) {
Person a=new Person();
a.walk();
a.eat();
	}

}
