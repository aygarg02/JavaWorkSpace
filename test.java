/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes*/
 import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class test {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
         int numberToChoose=sc.nextInt();
        int[] a=new int[sc.nextInt()];
       
       int k=0;
        int sum=0;
       
         int n=a.length;
       for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
       }
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             if(a[i]>a[j]){
                int temp= a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
         
     }
     }

for(int i=0;i<numberToChoose;i++){

	 sum=sum+a[i];
	if(a[i]==a[i+1]) {
		k=k+a[i];
	}
         int numberToChooses=sc.nextInt();
        int[] b=new int[sc.nextInt()];
       
       int k1=0;
        int sum1=0;
       
         int n1=b.length;
       for(int j=0;j<n1;j++){
          b[j]=sc.nextInt();
       }
     for(int l=0;l<n1;l++){
         for(int j=0;j<n;j++){
             if(b[i]>b[j]){
                int temp= b[l];
                 b[l]=b[j];
                 b[j]=temp;
             }
         
     }
     }

for(int l=0;l<numberToChooses;l++){

	 sum1=sum1+a[l];
	if(a[l]==a[l+1]) {
		k1=k1+a[l];
	}
   
}
System.out.println(sum1+k1);
    }
}}
