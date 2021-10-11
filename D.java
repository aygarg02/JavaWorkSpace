
public class D {

	public static void main(String[] args) {
		
		String[] arr= {"abc","ab","a"};
		int a=arr.length;
		int[] number=new int[a];
	
for(int i=0;i<a;i++) {
	int c=arr[i].length();
	number[i]=c;

}
System.out.println(number[0]);
int k=0;
int q=0;
for(int i=0;i<a;i++) {
	if(k<number[i]) {
		k=number[i];
	    q=i;
	}
	}
String z=arr[q];

	System.out.println(z); 
		}
	}


