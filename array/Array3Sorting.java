package array;

public class Array3Sorting {
public static void main(String[] args) {
//BUBBLE SORT(arranging in ascending order or descending order)
//in every iteration last digit is sorted or largest element is came in last
//	int a[]= {1,2,3,14,5};
//	int n=a.length;
//	boolean sorted=true;
//	
//	for(int j=0;j<n-1;j++) {
//	for(int i=0;i<n-j-1;i++) {
//		if(a[i]>a[i+1]) {
//			int temp=a[i];
//			a[i]=a[i+1];
//			a[i+1]=temp;
//			sorted=false;
//		}	}
//	if(sorted) break;
//	}
//	for(int item :a) {
//		System.out.print(item+"  ");
//		System.out.println();
//	}
//	selection sort
//	smallest digit came at start point
	int b[]= {1,12,14,5,6};
	int n=b.length;
	for(int i=0;i<n-1;i++) {
		for(int j=i;j<n;j++)
			if(b[i]>b[j]) {
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				sorted =false;
				}	
	
		}
	for(int item:b) {
		System.out.println(item);
	}
}
}
