import java.util.*;

public class mnmn {
public static void main(String[] args) {
	List<List<Long>> ans=new ArrayList<>();
	
    for(int i=0;i<4;i++){
        List<Long> res1=new ArrayList<>();
        ans.add(res1);
}
    List<Long> res=new ArrayList<>();
for(int i=0;i<10;i++) {
	 
	  res.add((long) 00000+i+0000);
}
for(int i=1;i<ans.size();i++) {
    for(int j=queries.get(i-1).get(0)-1;j<queries.get(i-1).get(1);j++) {

ans.get(i).add(j,ans.get(i-1).get(j)+queries.get(i-1).get(2));

    }}
    
   
    ans.set(0,res);
    System.out.println(ans.get(0).get(1));
    System.out.println(ans);
}
}
