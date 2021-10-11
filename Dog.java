import java.util.Scanner;

public class Dog {
	Scanner sc=new Scanner(System.in);
private String breed;
private String color;
private int size;
boolean aa=false;
// get method in java.......
public String  getbreead() {
	
	System.out.println("enter your name");
	int a=sc.nextInt()
;	if(a<20) {
	aa=true;
	return this.breed;}
else {return ("not alligiable");}
    
}
public void setbreed(String breed) {
	System.out.println("enter your status admin or employee");
	String a=sc.next();
	if(a.equals("admin")) {
		
	this.breed=breed;
	System.out.println("done breed is set to"+" "+this.breed);}
	else {System.out.println("sorry you do have right to do this");}
}








void desc() {
	if(aa==true) {
	System.out.println("breed of dog"+" "+breed+" ,"+"color of dog"+" "+color+" ,"+"size of dog"+" "+size);}
}
public Dog() {
	this("aaa","aaaa",44);
	
}
public Dog(String breed, String color, int size) {
	this.breed=breed;
	this.color=color;
	this.size=size;
}

	
	
}
