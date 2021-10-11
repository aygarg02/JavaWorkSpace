package internshalaProjectsSelf;

public class figures {
	public static void main(String[] args) {
		area c1=new area();
		c1.cir(3);
		System.out.println();
		c1.peri(7, 1);
		System.out.println(c1.rect(454, 88));
	}
}
class area implements perimeter{
	int length;
	int breath;
	int radius;
	int rect(int lenght,int breath) {
		int area=lenght*breath;
		return area;
		
	}
	int sqr(int lenght) {
		int area=lenght*lenght;
		return area;
		
	}
void cir(float radius) {
		float area=(float) (Math.PI*radius*radius);
		System.out.printf("%.2f",area);
		
	}
@Override
public void peri(int a, int b) {
	System.out.println(2*(a+b));
	
}

}
interface perimeter{
	void peri(int a,int b);
}
