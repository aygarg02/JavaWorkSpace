package conditionalStatement;

public class SwitchStatement {
	public static void main(String[] ar) {
	int dayOfWeek=2;
	switch(dayOfWeek) {
	case 1:
		System.out.println("1000");
		break;
	case 2:
		System.out.println("2");
		break;
	case 3:
		System.out.println("13");
		break;
	default:
		System.out.println("out of range");
	}
	switch(dayOfWeek) {
	case 1:
	case 2:
		System.out.println("1000");
		break;
	case 3:
		System.out.println("13");
		break;
	default:
		System.out.println("out of range");
	}
		
		
		
	}

}
