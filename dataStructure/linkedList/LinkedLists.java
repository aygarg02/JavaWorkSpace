package dataStructure.linkedList;
import java.util.*;
public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> ll=new LinkedList<>();
List<Integer> al=new ArrayList<>();
timeDiff(al);
timeDiff(ll);
	}
//all function of arryaList
static void timeDiff(List<Integer> Lists) {
	
	for(int i=0;i<100000;i++) {
		Lists.add(i);
		
	}
	long s=System.nanoTime();
	Lists.remove(10);
	long e=System.nanoTime();
	System.out.println(Lists.getClass().getName()+" "+(e-s));
}




	
	
	
	
	
	
	
	
	
	
	}
