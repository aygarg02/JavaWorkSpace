package dataStructure.linkedList;

public class LinkedList2 {
node head;
int size() {
	node temp=head; 
	int num=0;
	while(temp!=null) {
		temp=temp.next;
		num++;
	}
	return num;
}
int get(int index) {
	int num=0;
	int a=0;
	node temp=head; 
	while(temp!=null) {
	if(num==index) {
		 a=temp.data;
		 return a;
	}
	num++;
	temp=temp.next;
	
}return a;
	}




int set(int index,int data) {
	node toAdd=new node(data);
	int num=0;
	int a=0;
	node temp=head; 
	while(temp!=null) {
		
	if(num==index) {
		node t=temp.next;
		temp=toAdd;
		temp.next.next=t;	
	}
	num++;
	temp=temp.next;
	
}return a;
	}















void print() {
	node temp=head; 
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	
}
void add(int data) {
	node toAdd=new node(data);


if(head==null) {
	head=toAdd;
	return;
}
node temp=head; 
while(temp.next!=null) {
	temp=temp.next;
}
temp.next=toAdd;
}
boolean isEmpty() {
	if(head==null) {
	return true;}
	else {
		return false;
	}
	
	
	
}


void remove(int index) {
	
	int num=0;
	node temp=head; 
	while(temp!=null) {
	if(num==index-1) {
		temp.next=temp.next.next;
	
		return;
		
	}

	temp=temp.next;
	num++;
	
}
	}
	

static class node{
	int data;
	node next;
	public node(int data){
		this.data=data;
		next=null;
		
	}}
}
