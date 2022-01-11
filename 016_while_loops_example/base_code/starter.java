import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Whats your name?");
		String text = sc.nextLine();
		System.out.println("How many times would you like your name to be outputted?");
		int number = sc.nextInt();
		
		int count=0;
		
		while (true) 
		{
			System.out.println(text);
			if (count==number-1)
			{
			
				break;
				
			}
		
			count = count +1;
		}
	}
}

