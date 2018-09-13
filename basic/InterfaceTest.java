public class InterfaceTest{
	public static void main(String[] args){
		Test t = new Test();
		t.output1();
		t.output2();
		t.output3();
	}
}

interface Interface1{
	public void output1();
}

interface Interface2{
	public void output2();
}

class Parent{
	public void output3(){
		System.out.println("output3");
	}
}

class Test extends Parent implements Interface1,Interface2{
	public void output1(){
		System.out.println("output1");
	}
	
	public void output2(){
		System.out.println("output2");
	}
}