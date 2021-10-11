package internShalaAssingment;

import java.util.*;

public class Main {
public static void main(String[] args) {
	Cake c1=new Cake();
	Cake c2=new Cake();
	c1.setname("Chocolate Brownie");
	c1.setprice(250f);
	c2.setname("Chocolate Maple");
	c2.setprice(300f);
	Pastry p1=new Pastry();
	Pastry p2=new Pastry();
	p1.setname("Black Forest");
	p1.setprice(35f);
	p2.setname("Choco Truffle");
	p2.setprice(40f);
	
	
	
	
	
	
	
	List<Cake> l1=new ArrayList<>();
	List<Pastry> l2=new ArrayList<>();
	l1.add(c1);
	l1.add(c2);
	l2.add(p1);
	l2.add(p2);
	
	
System.out.println("   Today's Special Menu ");	
System.out.println("---------------------------- ");
System.out.println("Special Cakes");	
System.out.println("---------------------------- ");
for(Cake k:l1) {
	k.display();
	}
System.out.println();
System.out.println("Special Pastries");	
System.out.println("---------------------------- ");
for(Pastry p:l2) {
	p.display();
}
}
}
class Cake {
protected String name;
protected float price;
public void setname(String name) {
	this.name=name;
}
public void getname() {
	
	System.out.println(this.name);
}
public void setprice(float price ) {
	this.price=price;
}
public void getprice() {
	
	System.out.println(this.price);
}
public void display() {
	System.out.println(this.name+":"+this.price+"/-"+" "+"per pound");
}


}
class Pastry extends Cake{

	public void display() {
		System.out.println(super.name+":"+super.price+"/-"+" "+"per peice");
	}
}

