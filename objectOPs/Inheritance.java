package objectOPs;

public class Inheritance {
public static void main(String[] args) {
	dogs aj=new dogs();
	puppy a=new puppy();
	a.run();
}
}
class animal {
	void run() {
		System.out.println("he can run easily");
	}
}
class dogs extends animal {
	void run() {
		System.out.println("he  at dog can run easily");
	}
}
class puppy extends animal {
	void run() {
		System.out.println("he at puupy can run easily");
	}
}