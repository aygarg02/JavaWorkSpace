import java.util.PriorityQueue;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

public class Pro {
public static void main(String[] args) {
	List<Integer> que=new PriorityQueue<>();
	Scanner sc= new Scanner(System.in);
	int k=sc.nextInt();
	que.add(41);
	que.add(400);
	que.add(410);
	que.add(415);
	que.add(4175);
	que.add(417);
	que.add(471);
	int b=que.size();
	
for(int i=0;i<b-k;i++) {
	que.remove();
	}
	System.out.println(que);
}
}
