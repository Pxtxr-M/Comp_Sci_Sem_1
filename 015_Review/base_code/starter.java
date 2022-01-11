import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println ("What is your Characters name?");
	String text = sc.nextLine(); 
		
		System.out.println("How many points for Strength? (Maximum 10)");
		int number = sc.nextInt();
	
		if(number >11)
	{
		System.out.println("Error, You can only use a maxium of 10 points for this trait");
	}
		else 
	{
		System.out.println("You have used your points");
	}



		System.out.println("How many points for Dexterity? (Maximum 10)");
		int number2 = sc.nextInt();
			if(number <11)
	{
		System.out.println("Error, You can only use a maxium of 10 points for this trait");
	}
			
	{
		System.out.println("You have used your points");
	}
	
	
	
	
		System.out.println("How many points for Intellegence? (Maximum 10)");
		int number3 = sc.nextInt();
			if(number >11)
	{
		System.out.println("Error, You can only use a maxium of 10 points for this trait");
	}
			else 
	{
		System.out.println("You have used your points");
	}	
	
	
	
		System.out.println("How many points for Constitution? (Maximum 10)");
		int number4 = sc.nextInt();
			if(number >11)
	{
		System.out.println("Error, You can only use a maxium of 10 points for this trait");
	}
			else 
	{
		System.out.println("You have used your points");
	}	
	
	
	
		System.out.println("How many points for Charisma? (Maximum 10)");
		int number5 = sc.nextInt();	
			if(number >11)
	{
		System.out.println("Error, You can only use a maxium of 10 points for this trait");
	}
			else 
	{
		System.out.println("You have used your points");
	}	
		int max = 25;
		
	}
}
