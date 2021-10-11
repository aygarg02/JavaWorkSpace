package dataStructure.linkedList;

public class LinkedList3 {
public static void main(String[] args) {
	

	LinkedList2 myll=new LinkedList2();
	myll.add(5);
	myll.add(15);
	myll.add(75);
	myll.add(55);
	myll.add(55);
	myll.add(55);
System.out.println("the value at index give is" +" "+myll.get(0));
	System.out.println("size of your list is "+myll.size());
myll.set(1, 10);
	myll.print();
}}
