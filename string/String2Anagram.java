package string;

public class String2Anagram {

	public static void main(String[] args) {
		String a="aab";
		String b="abck";
		boolean[] visited=new boolean[a.length()];
		boolean isAnagram=false;
		if(a.length()==b.length()) {
			for(int i=0;i<a.length();i++) {
				isAnagram=false;
				for(int j=0;j<b.length();j++) {
					if(a.charAt(i)==b.charAt(j) && !visited[j]) {
						isAnagram=true;
						visited[j]=true;
						break;
						
					}
					
				} 
				if(!(isAnagram)) {break;}
			}
			
			if(isAnagram) {System.out.println("anagram");}
			else {System.out.println("not a anagram in loop");}
		}
		
		else {System.out.println("not a anagram");}
	}
}
