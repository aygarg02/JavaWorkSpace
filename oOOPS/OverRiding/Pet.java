package oOOPS.OverRiding;

public class Pet extends Animal {

	String name="Pet";
	void walks() {
		System.out.println("Pet can walk ");
	}
	void walk() {
		System.out.println("Pet can walk in the stright way");
	}
	void talk() {
		System.out.println("Pet can talk");
	}

}
