package NoStatic;

public class NonStaticMembersDemo {
	
	int num;
	
	NonStaticMembersDemo() {
		System.out.println("Inside the constructor 1");
	}
	
	{
		System.out.println("Inside the non static block 2");
	}
	
	public static void main(String[] args) {
		System.out.println("insede the main method 3");
		NonStaticMembersDemo obj = new NonStaticMembersDemo();
		
		obj.doSomething();
	}
	
	static {
		System.out.println("Inside the static block 4 ");
	}
	
	void doSomething() {
		System.out.println("Insede doSomething");
	}
	
}
