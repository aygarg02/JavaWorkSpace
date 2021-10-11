
public class aaaaaaa {
public static void main(String[] args) {
	person p1 = new person() ;
	p1.age=52;
	p1.name="ayush";
	p1.walk();
	developer d1=new developer(25,"aaa");
	d1.name="ayus";
	d1.working();
	webdeveloper w1=new webdeveloper(25,"ay");
	w1.walk();
	w1.addOfAge(10);
	System.out.println(w1.age);}
}
class webdeveloper extends developer{

	webdeveloper(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}
	int addOfAge(int age) {
		super.age=age+1;
		return super.age;
		
	}
	
}
class developer extends person{
	developer(int age ,String name){
super.age=age;
super.name=name;
	}
	void working() {
		System.out.println(this.name+" "+"working on computer presently");
	}
}


class person {
	protected String name;
	int age;
	 person(){ 
		
		
	}
	 person(int age,String name){
		 this.age=age;
		 this.name=name;
	 }
	void walk() {
		System.out.println(name+" "+"he is walking");
	}
}
