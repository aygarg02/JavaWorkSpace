package objectOPs;

public class Interface2 {
public static void main(String[] args) {
	
remote re=new tv();
re.up();
}
}
interface remote{
	void up();
	void down();
	void chanelup();
	void chaneldown();
}
class tv implements remote{
	@Override
	public void up() {
		System.out.println("up the vol");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chanelup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chaneldown() {
		// TODO Auto-generated method stub
		
	}
}
