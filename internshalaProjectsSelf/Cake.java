package internShalaAssingment;

public class Cake {
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
