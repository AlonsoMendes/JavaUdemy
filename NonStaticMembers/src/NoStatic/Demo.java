package NoStatic;

public class Demo {
	
	static Demo obj = new Demo();

	static {
		System.out.println(Demo.obj+" 1");
		Demo.init();
	}
	
	public static void main(String[] args) {
		System.out.println(Demo.obj);
	}
	
	static Demo init(){
		return new Demo();
	}
}
