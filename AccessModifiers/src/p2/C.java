package p2;

import p1.A;

public class C extends A {

	public static void main(String[] args) {
		
		A aObjetc = new A();
		
		System.out.println(aObjetc.d);
		
		C cObjet = new C();
		System.out.println(cObjet.c);
		System.out.println(cObjet.d);
	}

}
