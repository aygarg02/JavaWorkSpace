import java.util.ArrayList;
import java.util.List;

public class sdsd {
public static void main(String[] args) {
	List<Integer> ans=new ArrayList<>();
	List<Integer> ans1=new ArrayList<>();
int d=2;

	int[] arr= {1,2,3,4,5};
	for(int i=0;i<d;i++){
	    ans.add(arr[i]);
	}
	for(int i=d;i<arr.length;i++){
		 ans1.add(arr[i]);
	}
	
	ans1.addAll(ans);
	
}
}
