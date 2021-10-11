
public class www {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String pass="Ab1";
boolean va=false;
int n=pass.length();
int strong=0;
String numbers = "0123456789";
String lower_case = "abcdefghijklmnopqrstuvwxyz";
String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String special_characters = "!@#$%^&*()-+";
for(int i=0;i<n;i++) {
	int h=0;
	for(int j=0;j<numbers.length();j++) {
		boolean are=false;
	if((pass.charAt(i)==numbers.charAt(j))) {
	are=true;
		strong++;
		h++;
		System.out.println("Aaa1");
		break;
	}
	if(are==true)break;}
	if(h==1)break;
}
for(int i=0;i<n;i++) {
	int h=0;
	for(int q=0;q<lower_case.length();q++) {
	
	if((pass.charAt(i)==lower_case.charAt(q))) {
		strong++;
		h++;
		
		System.out.println("Aaa2");
		break;
	}
	if(h==1)break;
	}if(h==1)break;}
for(int i=0;i<n;i++) {
	int h=0;
	for(int q=0;q<upper_case.length();q++) {
		if((pass.charAt(i)==upper_case.charAt(q))) {
			strong++;
			h++;
			System.out.println("Aaa3");
			
			break;
		}
		
		}if(h==1)break;}
for(int i=0;i<n;i++) {
	int h=0;
	for(int q=0;q<special_characters.length();q++) {
		if((pass.charAt(i)==special_characters.charAt(q))) {
			strong++;
			h++;
			System.out.println("Aaa4");
			break;
		
		}
	
		}
	if(h==1)break;
}
	
	int sum=4-strong;	
	
	if(n<6) {
		int k=6-n;
		int big=Math.max(sum, k);
		System.out.println(big);
	}
	else {
		System.out.println(sum);
	}
	}}


