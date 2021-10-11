import java.util.List;

import java.util.ArrayList;

public class Aryan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> Arr=new ArrayList<>();
		Arr.add(1);
		Arr.add(2);
		Arr.add(3);
		Arr.add(1);
		Arr.add(4);
		Arr.add(5);
		Arr.add(2);
		Arr.add(3);
		Arr.add(6);
	
		
	int t=0;
	int f=0;
		int N=Arr.size();
		
		int K=3;
		 ArrayList<Integer> ans=new ArrayList<>();
		int num=0;
		   while(K<=N){
			   int b=0;
	            for(int i=num;i<K-1;i++){
	            
	              if(Arr.get(i)<Arr.get(i+1)){
	            	b=Arr.get(i+1);
	            	t=b;
	              }
	              else{b=Arr.get(i);System.out.println(b);  f=b;}
	              
	             
	            }
	          int c=t>f?t:f;
	           ans.add(c);
	            K++;
	            num++;
	        } 
		   System.out.println(ans);
	}

}
