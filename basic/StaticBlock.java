public class StaticBlock{
	public static void main(String[] args){
		new C();
		new C();
	}
}

class A{
	static {
		System.out.println("A's static block");
	}
	public A(){
		System.out.println("A's constrctor");
	}
}

class B extends A{
	static {
		System.out.println("B's static block");
	}
	public B(){
		System.out.println("B's constrctor");
	}
}

class C extends B{
	static {
		System.out.println("C's static block");
	}
	public C(){
		System.out.println("C's constrctor");
	}
}