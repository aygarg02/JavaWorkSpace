package recursion;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum(5));
System.out.println(path(2,5));

	}
 static int sum(int n) {
	if(n==1) {
		return 1;
	}
	return sum(n-1)+n;
	
}
 static int path(int n,int m) {
	 if(n==1 && m==1) {
		 return 1;
	 }
	 return n+m-1;
	 
	 
	 

	 
 }


 
 
 
 
}
