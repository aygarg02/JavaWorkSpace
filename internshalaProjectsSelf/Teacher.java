package internshalaProjectsSelf;

import java.util.*;

public class Teacher {
public static void main(String[] args) {
	
	student s1=new student("aa",52,50);
	student s2=new student("aa",54,57);
	student s3=new student("aa",57,59);
	student s4=new student("aa",55,55);
	student s5=new student("aa",52,51);
	student s6=new student("aa",42,52);
	student s7=new student("aa",72,45);
	List<student> l1=new ArrayList<>();
	l1.add(s7);
	l1.add(s6);
	l1.add(s5);
	l1.add(s4);
	l1.add(s3);
	l1.add(s2);
	l1.add(s1);
	System.out.print("marks");
	System.out.print("|  name");
	System.out.print(" | rollNo");
	System.out.println();
	for(student s:l1) {
	
		System.out.print(s.marks);
		System.out.print("   |   ");
		System.out.print(s.name);
		System.out.print("  |   ");
		System.out.print(s.rollNo);
		System.out.println();
	}


}
}
class student{
	
	
	String name;
	int rollNo;
	int marks;
	public student(String name, int rollNo, int marks) {
		this.marks=marks;
		this.name=name;
		this.rollNo=rollNo;
		
	}
	
}