package dataStructure.arrayList;
import java.util.ArrayList ;
import java.util.List;

public class ArrayLists {

		// TODO Auto-generated method stub
//		they are also known as dynamic array
//		resizable i.e size not fixed 
//		size vary according to the demand 
	// basically it is a list of ordered sequence 
	//v


	

	 public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList();	/*we could write list here that is  easy for interconversion*/
	 List<Integer> arr=new ArrayList();/*this is a list not array*/
	 arr.add(55);
	 
	                /* method in ArrayList*/
	/* add(element)*/ arr1.add(5);
	/*add at particular location*/ arr1.add(1,10);
	/* addAll(collection)*/arr.addAll(arr1);
	/* get(index)*/System.out.println(arr.get(1));
	/* set(index,value)*/arr.set(0,6);System.out.println(arr.get(0));
	/* remove(index)*/arr.remove(0);System.out.println(arr.get(0));
	/* removeAll()*/arr.remove(arr1);
	/* clear()*/arr.clear();
	/* size()*/arr.size();
	/* contains()*/ arr.contains(40);
	/* isEmpty()*/arr.isEmpty();
	/* toArray(array)*/Object arr2[]=arr.toArray();
	//to array is imp
	   ArrayList<String> fruit=new ArrayList<>();
	   fruit.add("orange");
	   fruit.add("apple");
	   fruit.add("guava");
	   System.out.println(fruit);
	//   fruit is a list to convert it into array we use toArray modified version
	   
	   String[] arr5=new String[fruit.size()];
	   fruit.toArray(arr5);
	   for(String e:arr5) {
		   
		   System.out.println(e);
	   }
	   
	}
	}



	


