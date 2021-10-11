//q means nothing here..only for serial
//Constructor is used to initialize the value of  object 
//Constructor does not return anything and it is similar to method
//name of constructor is similar to the name of class
//without the constructor the default value is store in every state of object 
//Constructor overloading also occur
//there are two type of constructor parametric or non parametric
//constructor in which parameters are passed are know as parametric
//constructor in which no parameters are passed are know as non parametric
//there is a default constructor that store the default value of every state of class
//whenever we made a object either we made a constructor or not.there always a constructor known as default constructor which store default value of every state of
//this whenever we are creating the class or object address of that class is stored in this keyword for some time
//if you had made a constructor by yourself then you are not able to call default constructor..MI
package oOOPS;
class vehicle{
	int wheel;
	String color;
	String state;
	
	vehicle(int wheel){
		this.wheel=wheel;
		color="red";}
	vehicle(){
			state="ready";
		}
		
	


}

public class QConstructer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
vehicle car=new vehicle(4);
vehicle scooty=new vehicle(2);
vehicle scoo=new vehicle();
System.out.println(car.wheel);
System.out.println(scooty.wheel);
System.out.println(scoo.state);
vehicle random=new vechile();
//not able to use default constructor.....
//to use default constructor we have to make default constructor e.g vechile() {}
	

	

	}

}
