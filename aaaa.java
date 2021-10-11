import java.util.Deque;
import java.util.List;

public class aaaa {
public static void main(String[] args) {
	int[] arr= {2,3,1,5,7,1,2,5,4,3};
	int n=arr.length;
	int k=4;
	Deque<Integer> dq=new LinkedList<>();
	int[] ans=new int[n-k+1];
	int i=0;
	for(;i<k;i++) {
		while(!(dq.isEmpty()) && arr[dq.peekLast()]<=arr[i]){
			dq.removeLast();
		}
		dq.addLast(i);
		
	}
	for(;i<n;i++) {
		ans[i-k]=dq.peekFirst();
		while(!(dq.isEmpty()) && arr[dq.peekFirst()]<=i-k) {
			dq.removeFirst();
		while(!(dq.isEmpty()) && arr[dq.peekLast()]<=arr[i]){
				dq.removeLast();
			}
			dq.addLast(i);
		}
		ans[i-k]=dq.peekFirst();
	}
System.out.println(ans);


	
	
	
	
	
}
}