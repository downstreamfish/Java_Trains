public class ExceptionTest{
	public static void main(String[] args){
		try{
			int c = 0;
			int a = 3, b = 0;
			c = a / b;
		}catch(ArithmeticException e){
			e.printStackTrace();
		}finally{
			System.out.println("Hello World!");
		}
		System.out.println("Welcome");
	}
	
}