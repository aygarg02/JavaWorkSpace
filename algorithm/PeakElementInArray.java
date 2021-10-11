package algorithm;

public class PeakElementInArray {
int findapeak(int[] arr,int low,int high,int n) {
	int mid=low+(high-low)/2;
	if( arr&&arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
		return mid;
	}
	
	
	
	return 0;
	
}
	public static void main(String[] args) {
	
		
		int[] a = {10,20,3,7,67};
	int l=a.length;
		System.out.println(l);
		
		
		
		

	}

}
