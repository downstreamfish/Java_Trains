import java.util.Random;
import java.util.Scanner;

public class GuessStarter
{
	public static void main(String[] args){
		Random random = new Random();
		Scanner in = new Scanner(System.in);

		int number = random.nextInt(100) + 1;
		//System.out.println(number);

		System.out.print("I'm thinking of a number between 1 and 100\n" +
				"(including both). Can you guess what it is?\n");
		System.out.print("Type a number: ");
		int guess = in.nextInt();
		System.out.printf("You guess is %d\n", guess);
		System.out.printf("The number I was thinking of is: %d\n", number);
		System.out.printf("You were off by: %d\n", guess - number);
	}
}
