package dSA;

import java.util.ArrayList;
import java.util.List;

public class IthBitPure {
	public static void main(String[] args) {
		
		List<Character> l1=new ArrayList<>();
		int n=88;
		int b=0;
		String sa=null;while(n>0) {int a=n&1;
		if(a==0) {l1.add('0');}
		else {l1.add('1');}n=n>>1;}
		char[] aaa=new char[l1.size()];
		for(int i=l1.size()-1;i>=0;i--) {aaa[l1.size()-1-i]=l1.get(i);}
		sa=String.valueOf(aaa);
		int p=Integer.parseInt(sa);
		System.out.println(p);
		int mask=1<<3;
		int op=p^mask;
		System.out.println(op);
		
}
}