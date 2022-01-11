import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("guess a number between 1-100");
		int number = sc.nextInt();
		if(number == 99)
		{
		System.out.println("you won");
		}
		else 
		{
			System.out.println("Wrong");
		}
	}
}
