package string;

public class String3Anagram {

	public static void main(String[] args) {
		String a="abb";
		String b="bda";
		boolean isanagram=false;
  int[] al=new int[256];
    
  for(char c:a.toCharArray()) {
	  int k= (int)c;
	  al[c]++;
	  
  }
  for(char c:b.toCharArray()) {
	  int k= (int)c;
	  
	  al[c]--;
	  
  }	
  for(int i=0;i<256;i++) {
	  isanagram=false;
	  if(al[i]==0) {
		  isanagram=true;
	  }
	  if(!(isanagram)) {
		  break;
	  }
  }
  if(isanagram) {
  System.out.println("is anagram");}
  else {System.out.println("not a angram");}
	
	

	
	
	}
}
