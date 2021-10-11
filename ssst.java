
public class ssst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String a="ayuhaaaabberrrr";
int n=a.length();
char[] arr=new char[n];

boolean[] visited=new boolean[n];
char b=a.charAt(0);
for(int i=0;i<n;i++) {
if(!(b==a.charAt(i))){}		
		b=a.charAt(i);
		arr[i]=b;
				
	}
for(int i=0;i<n;i++) {
	System.out.println(arr[i]);
}
}

}
