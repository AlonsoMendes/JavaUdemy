package Static;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("Inside main");
		StaticMethodsDemo.metho1();
	}

	static void metho1() {
		System.out.println("insede method1");
	}
	
	static {
		System.out.println("Insede the static block");
		StaticMethodsDemo.metho1();
	}
	
}
