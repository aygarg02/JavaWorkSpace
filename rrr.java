
public class rrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="DNFjxo?b5h*5<LWbgs6?V5{3M].1hG)pv1VWq4(!][DZ3G)riSJ.CmUj9]7Gzl?VyeJ2dIPEW4GYW*scT8(vhu9wCr]q!7eyaoy.";
int k=45;
int r=0;
String d="";
int n1=s.length();

String c="null";
int b1=0;
String[] arr=new String[n1];
if(k>26) {
	int w=k/26;
	int u=w*26;
	r=k-u;
	k=r;
}

for(int i=0;i<n1;i++) {
	int a=(int)s.charAt(i);
	
	if(a>=65 && a<=90-k) {b1=a+k;}
	else if(a>90-k && a<=90) {b1=a+k-26;}
	
	
	else if(a>=97 && a<=122-k) {b1=a+k;}
	else if(a>122-k&& a<=122 ) {b1=a+k-26;}
	

	else if(a<65) {b1=a;}
	else if(a>90 && a<97) {b1=a;}
	else if(a>122) {b1=a;}

	char b=(char)b1;
	
	c=Character.toString(b);
	arr[i]=c;
                     }
for(int i=0;i<1;i++) {
	for(int j=0;j<n1;j++) {
	 d=d+arr[i+j];
	}
}
System.out.println(d);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
