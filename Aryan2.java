
public class Aryan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {4, 2  ,-3, 1, 6};
int a=0;
int num=0;
boolean f=false;
//while(num==arr.length-1) {
for(int i=0;i<arr.length;i++) {
	a=0;
			for(int j=i;j<arr.length;j++) {
			
				a=arr[j]+a;
			  
				System.out.println(a);
				if(a==0) { f=true;break; }
				
			}
			System.out.println("new value is ");
			if(a==0) { f=true;break; }}
//			if(a==0) { f=true;break; }
//			num++;
//}
			
		
	
		System.out.println(f);

}}
