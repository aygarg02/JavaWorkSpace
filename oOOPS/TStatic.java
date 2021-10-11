package oOOPS;


public class TStatic {

	  static int myMethod(int a,int b) {
		  
		return Math.max(a, b);
		   
		  }	
	
	 class a{
		String a;
	}
	 static class b{
			String a;
		}
	 static {
		 System.out.println("a");
	 }
	public static void main(String[] args) {
//		          static for field and method in class
//		static keyword is related to class
//		we make the copy or object of class then static field or method in class does not go with the object it is related to class
//		static keyword means does not vary with the object remain same in every object of class
//		can not make static class ,field ,method outside the public class
//		inner type could be static class
//           static inner class
//		in other page then we have to import the class
//		for simple class
		TStatic obj1=new TStatic();
		a obj=obj1.new a();
//		          for static class
//		we do not have to import the outer class than inner class when we use static class
//		mainly used when the inner class do not related to outer class 
//		but put inside the outer class because of  encapsulation 
//		but we we can see that class directly
		b obj3=new b();
		obj.a="aa";
		System.out.println(obj.a);
//    static block 
//		block run first than the public class and mian method in java 
System.out.println(myMethod(5,20));

}}
