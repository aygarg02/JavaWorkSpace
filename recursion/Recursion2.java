package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recursion2 {
public static void main(String[] args) {
	System.out.println("ayys"+45);
	String aq="ayus";
	aq.length();
	 List<Integer> ans=new ArrayList<>();
	 List<Integer> arr=new  ArrayList<>();
	 arr.add(1);
	 arr.add(1);
	 arr.add(1);
	 arr.add(0);
	 arr.add(-1);
	 arr.add(-1);
	 Collections.sort(arr);
	 System.out.println(arr);
	 int a=arr.get(0);
	
	 int num=0;
	 for(int i=0;i<arr.size();i++){
		
	     if(arr.get(i)==a){
	         num++;
	    
	     }
	  
	     else {
	    	
	       a=arr.get(i);
	         
	        System.out.println(num);
	        
	      
	        num=1;
	       
	     }
	   
	 }
	 long[] ar=new long[ans.size()];
	 for(int i=0;i<ans.size();i++){
	     ar[i]=ans.get(i)/ans.size();
	 }
	 for(long e:ar){
	 System.out.println(e+"00");}
	
	
	
}
}
