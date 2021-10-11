
public class cq {
	public static void main(String[] args) {
int[] arr= {6 ,56, 93 ,-12 ,26, 78, 79 ,58, 53, 52 ,51, 55 , 77 -2 ,61 ,-26 ,91, 16 ,100 ,-8, 72};
int n=arr.length;
int q=0;
int w=0;
int e=0;
boolean a=false;
        //add code here.
        for(int i=0;i<n;i++){
             for(int j=1;j<n-1;j++){
                  for(int k=2;k<n-2;k++){
                      if(arr[i]+arr[j]+arr[k]==0 && k!=i && j!=k && i!=j){
                         q=i;
                         w=j;
                         e=k;
                         
                           a=true;
                      }
                     
                      
                  }
             }
        }
        System.out.println(arr[q]);
        System.out.println(arr[w]);
        System.out.println(arr[e]);
     
      System.out.println(a);
}
	
	
	
	
}
