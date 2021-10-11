import java.util.Stack;

public class aaaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="[([])]";
		int n=s.length();
		Stack<Character> stack=new Stack<>();
		Stack<Character> stack1=new Stack<>();
       stack.push('}');
       stack.push(']');
       stack.push(')');
       stack1.push('{');
       stack1.push('[');
       stack1.push('(');
       for(int i=0;i<n;i++) {
       if(stack.peek()==s.charAt(i)) {
    	   for(int j=0;j<n;j++) {
    		   if(stack1.peek()==s.charAt(j)) {
    			   stack1.pop();
    			   stack.pop();
    		   }
    	   } 
       }
       }
       if(stack1.isEmpty() && stack.isEmpty())System.out.println(true);
       else {System.out.println("not balanced");}
	}

}
