package array;

import java.util.Scanner;

public class Array1 {
public static void main(String[] args) {
//1.	data structure=data storing technique
//2.	it is a type of data structure that store the multiple value in a single variable is known as array;
//3.   it can store any primitive data type such as string char int float boolean double short 
//4.	array can store only one data type at one time with multiple value in it 
//5.   so it is called safe type	
//6.	e.g name of cars we have ,name of students,number of students
//7.	indexing ha 0 to 4 for n=5 a number in range 0<array[n]>n-1
//8.	Continuous fashion ma value store ha 
//9.     by default 0 is store in variable
//10.    marks[0] loaction accesss of array
//11.    put value in the array int[] a={1,23,4,511}
//	to access a[1]
//	ans is 23
//12.update the value
//	a[1]=12;
//	now a[1] be 12 ;not 1

	
	
	//......declaration of array.....
// 	int[] numbers=new int[10];

	////................	second method.....
//	int[] numbers;
//	Numbers=new int[10];

	//......................	3rd method.......
//	int marks[]=new int[10];

//..............	creating 2 array or single  variable....
//	int RollNOs[],calss;
//	int c[],d[];
	
//..........	both a varibale as array............
//	int[] a,b;
//	...to access value in array ...
//	marks[0]; 
//	a number in range 0<array[n]>n-1
 
	
	
	
	int markss[]= {12,13,4,5};/* Assigning value to array*/
 markss[3]=69;/*updating the value*/
// System.out.println(marks[3]);/*Printing the value*/
 
 
          /*Fetching all the value of array*/	
// for(int i=0;i<marks.length;i++) {
//		System.out.println(marks[i]);}
	
 Scanner sc=new Scanner(System.in);
System.out.print("enter the value");
 int students=sc.nextInt();
 int sum=0;
 int n=students;
 int[] marks=new int[n];
 for(int i=0;i<marks.length;i++) {
	 System.out.print(" enter the value of array at position"+i+":");
	 marks[i]=sc.nextInt();
	int a=marks[i];
			sum +=a;
 }
 
 int k=sum/marks.length;
 System.out.println("average is: "+k);

}}
