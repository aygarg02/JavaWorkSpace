package internshalaProjectsSelf;

public class check {
public static void main(String[] args) {
	add b=new add();
	b.ad();
	System.out.println(b.x);
}
}
class add{
	int x=0;
	void ad() {
		x++;
		x++;
	}
}