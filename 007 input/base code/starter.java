import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("First Name");
		String text = sc.nextLine(); 
		System.out.println("What is your age");
		int number = sc.nextInt();
		System.out.println("What is your Birthday Month");
		int number2= sc.nextInt();
		System.out.println("What day were you born");
		int number3=sc.nextInt();
		System.out.println("What year were you born");
		int number4=sc.nextInt();
		System.out.println("How much is a buck fifty");
		int number5=sc.nextInt();
		
		
		System.out.print("your name is: " + text);
		System.out.print("your age is: " + number);
		System.out.print("your birthday month is: " + number2);
		System.out.print("The day you were born is: " + number3);
		System.out.print("The year you were born " + number4);
		System.out.print("How much is a buck fifty " + number5);
		
		
		
		
	}
}
