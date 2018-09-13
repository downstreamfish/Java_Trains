import java.util.Scanner;
/**
 * exchange cm to inch
 */
public class CM2Inch
{
	public static void main(String[] args){
		double cm;
		int feet, inches, remainder;
		final double CM_PER_INCH = 2.54;
		final int IN_PER_FOOT = 12;
		Scanner in = new Scanner(System.in);

		System.out.print("Exactly how many cm?");
		cm = in.nextDouble();

		inches = (int)(cm / CM_PER_INCH);
		feet = inches / IN_PER_FOOT;
		remainder = inches % IN_PER_FOOT;
		System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
		System.out.print("What's your age?");
		int age = in.nextInt();
		in.nextLine();
		System.out.print("What's your name?");
		String name = in.nextLine();
		System.out.printf("Hello %s, age %d\n", name, age);
	}
}
