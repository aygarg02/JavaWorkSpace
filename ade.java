import java.util.*;
public class ade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1 ,4 ,45, 6, 10, 8};
        boolean a=false;
   
        int n=A.length;
        int i=0;
        int j=n-1;
        int q=0;
       //add code here.
       Arrays.sort(A);
     
       
while(i<j){
	
               if(A[i]+A[j]<q){
                   i++;
               }
               else if(A[i]+A[j]>q){
                   j--;
               }
               else if(A[i]+A[j]==5){
              a=true;
              break;
               }
           
        
           
       }

		
	System.out.println(a);	
	}

}
