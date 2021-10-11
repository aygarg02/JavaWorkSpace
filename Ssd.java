import java.util.*;
public class Ssd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,8,3,10,15};
		
	    Arrays.sort(arr);
  int x=5;
        int i=0;
        int j=arr.length;
        
            while(i<j){
                if(arr[i]+arr[j]<x){
                    i++;
                }
                else if(arr[i]+arr[j]>x){
                    j--;
                }
                else if(arr[i]+arr[j]==x){
                 System.out.println("hi ever");
                }
            
         
            
        }

	}

}
