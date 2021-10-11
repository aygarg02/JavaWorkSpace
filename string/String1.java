package string;

public class String1 {
	public static void main(String[] args) {

//	" ":means strings
//	'':means char
//	literal and object initialization are two method
//	by literal value goes to string pool area
//	by object value goes to both string pool as well as to heap area
//	if the string pool area contain the same value as to assigned to the new variable than it do not create new space it assign the store value to that variable also 
//	but the heap area store the value even if the same value is present
//	but it do not store if same in string pool area on running object command and it store in heap area
//some fxn used in String..
//		0.what type it return  code of fxn
//		1.char                 charAt(it Index)
//		2.int                  length()
//		3.String               substring(int beginIndex)
//		4.String               substring(int beginIndex,int endIndex) end index -1
//		5.boolean              contains(CharSequence s)
//		6.boolean              equals(Object another)
//		7.boolean              isEmpty()
//		8.String               concat(String str)
//		9.String               repalce(char old,char new)
//		10.String[]            split(String regex)
//		11.int                 indexOf(int ch)
//		12.String              toLowerCase()
//		13.String              toUpperCase()
//		14.String              trim()
//		15.String   o/p type   type.parseInt(value or variable) type means integer,double...  ,String to type
//		16.type     o/p String type.toString(value or variable) type means integer,double... ,type to String
//		17.char[]   o/p string  String.valueOf(name of character array )
	String name="ayush";
	String Anothername=new String("ayush");
	String name1="ayush1";
//	heap area and pool area are different ..
//	System.out.println(name==Anothername);
//String are immutable value can not be change so:-  ayush is still there is memory ..
      String name4="aysuh";
      name4="grag";
//      System.out.println(name4);
//  some function present in String class....  		  
      String name5="ayush@kumar@garg";
      String name6=new String("ayush");
      System.out.println(name5.charAt(0));
      System.out.println(name5.length());
      System.out.println(name5.substring(5,10));
      System.out.println(name5.substring(5));
      System.out.println(name5.contains("gar"));
      System.out.println(name5.equals(name6));
      System.out.println(name5.isEmpty());
      System.out.println(name5.concat(name6));
      System.out.println(name5.concat("aysu"));
      System.out.println(name5+name6);/*+operator also work for string concat*/
      System.out.println(name5.replace('a', 'c'));
//     String a[]= name5.split("@k");
//      for(String item:a) {
//    	  System.out.println(item);
//      }
      System.out.println(name5.indexOf('y'));
      String name7="   ayush     ";
      System.out.println(name7.trim());
      
      
      
      
      
      
      
	}
	}
