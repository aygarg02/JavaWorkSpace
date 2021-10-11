package dSA;

import java.util.ArrayList;
import java.util.List;

public class BinaryToBits {
public static void main(String[] args) {
	long n=2090400;

	List<Integer> l1=new ArrayList<>();
	System.out.println(System.currentTimeMillis());
	while(n>0) {
		long ajj=n&1;
	if(ajj==0) {
	l1.add(0);
	}
	else {
		l1.add(1);
	}
	
	n=n>>1;
	
	}
	System.out.println(System.currentTimeMillis());
	for(int i=l1.size()-1;i>=0;i--) {
	System.out.print(l1.get(i));}
	System.out.println();
}
}
