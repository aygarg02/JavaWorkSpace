
public class eee {

	public static void main(String[] args) {
		String a="ayaab";
		int n=5;
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String y="null";
        String z="null";
		int b=lower_case.length();
		int n1=a.length();
		for(int i=0;i<n1;i++) {
			for(int j=0;j<b-n;j++) {
				if(a.charAt(i)==lower_case.charAt(j)) {	
	 y=a.replace(a.charAt(i),lower_case.charAt(j+n));
				
				}
				System.out.println(q);
				}
					for(int o=b-n;o<b;o++) {
					if(a.charAt(i)==lower_case.charAt(o)) {
						System.out.println(i);
						 z=a.replace(a.charAt(i),lower_case.charAt(i));
					}
					}
					 System.out.println(z);
		}
	}
}
