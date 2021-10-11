package string;

public class String4ReverseAssingment {

	public static void main(String[] args) {
		String d="    I Love       java,                  the     coffee      ";
		String line=d.trim();
		String l[]=line.split(" ");
		int num=0;

		for(String item:l) {
		
			num=num+1;
			System.out.print(item+" ");
			}
		System.out.println();
	 for(int j=num-1;j>=0;j--) {
		if(!(l[j].isEmpty())) {
					System.out.print(l[j]+" ");
		}			
	 }
	 }}


