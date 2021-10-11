
public class S {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6};
	int n=a.length;
	  int b=n/2;
      int sum1=0;
      int sum2=0;
      for(int i=0;i<b;i++){
          sum1=sum1+a[i];
          
      }
      for(int i=b;i<n;i++){
          sum2=sum2+a[i];
      }
      System.out.println(sum1);
      System.out.println(sum2);
    int k=Math.abs(sum1-sum2);
    System.out.println(k);
}
}
