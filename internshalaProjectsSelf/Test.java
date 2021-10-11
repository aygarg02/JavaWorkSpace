package internshalaProjectsSelf;

public class Test {
public static void main(String[] args) {
	b o=new b();
	o.a=5;
	o.b=445;
	o.dis();
}
}
class a{
	int a;
	void dis() {
		System.out.println(a);
	}
	}
class b extends a{
	int b=0;
	void dis() {
		System.out.println(b);
	}
}