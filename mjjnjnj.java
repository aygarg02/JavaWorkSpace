import java.util.Scanner;

public class mjjnjnj {
	public static void main(String[] args) {
//		boolean a=true;
//		char av='\u20B9';
//		double aa=774.44d;
//		System.out.println(aa);
//		
//		Scanner sc=new Scanner(System.in);
//		int af=sc.nextInt();
//		double ag=sc.nextDouble();
////		String s=sc.nextLine();
//		int i = 4;
//        double d = 4.0;
//        String s = "HackerRank ";
//		
//        Scanner scan = new Scanner(System.in);
//                int a=scan.nextInt();
//                double b=scan.nextDouble();
//                scan.nextLine();
//                String name=scan.nextLine();
//          
//             System.out.println(name);
//                System.out.println(i);
//                 System.out.println(d);
////                
//                  scan.close();
		
		double meal_cost=10.25;
		int tip_percent=17;
		int tax_percent=5;
		double a=(meal_cost/100)*tip_percent;
		System.out.println(a);
		double b=(meal_cost/100)*tax_percent;
		System.out.println(b);
		double c=a+b+meal_cost;
		System.out.println(c);
		int d=(int) c;
		System.out.println(Math.round(c));

		
		
		
		
	}


}
