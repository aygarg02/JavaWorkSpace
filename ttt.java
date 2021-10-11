
public class ttt {

	public static void main(String[] args) {
		String s="SOSSOT";
		int n=s.length();
		
		int k=n/3;
		int s1=k*2;
		int o=k;
		int num=0;
		int num1=0;
		
		for(int i=0;i<k;i++) {
			for(int j=3*i;j<3*i+1;j++) {
				if(!(s.charAt(j)=='S')) {
					num++;
					
				}
				if(!(s.charAt(j+1)=='O')) {
					num++;
					
				}
				if(!(s.charAt(j+2)=='S')) {
					num++;
				
				}
			}
		}
		System.out.println(num);
		
		
		
		
		
		
		
		
		
//		String a[]= s.split("SOS");
//      for(String item:a) {
//	  System.out.println(item);
//      }
		
		
		
		
//		for(int i=0;i<k;i++) {
//			if(s.contains("SOS")) {
//				
//				num++;
//			}
//		}
//		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i=0;i<n;i++){
//		    
//		        if(s.charAt(i)=='S'){
//		            num++;
//		            
//		        }
//		        if(s.charAt(i)=='O'){
//		            num1++;
//		        }
//		        
//		    
//		}
//		
//		int wroung=s1-num;
//		int wroung1=o-num1;
//		int ans =wroung+wroung1;
//		System.out.println(ans);

	}

}
