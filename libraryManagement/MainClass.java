package libraryManagement;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Admin a=new Admin();
   Librarian a1=new Librarian();
   Scanner sc=new Scanner(System.in);
  System.out.println("who you are"); 
  String whoYouAre=sc.next();
  String Request=whoYouAre;
  String status="admin";
   if(Request==status) {
	   System.out.println("welcome");
   }
   
   else {System.out.println("not going well");}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	}

}
