package bonusprograma;

public class SwitchCase {
	
	public static void main(String[] args) {
		int a= 21;
		final int b= 20;
		
		switch (a) {
		case 10:
			System.out.println("Case 10");
			break;
		case b+1:
			System.out.println("Case 20");
			break;
		case 30:
			System.out.println("Case 30");
			break;
		default:
			System.out.println("No Matches");
			break;
		}
	}

}
