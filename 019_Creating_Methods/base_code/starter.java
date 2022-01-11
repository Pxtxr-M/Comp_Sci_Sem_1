import java.util.Scanner;
import java.util.Random;

class test {
	
	public static int MultDiv3(int x, int y){
	int num1 = x;
	int num2 = y;
	int product = num1 * num2;
	if (product%3==0)
	return "Its divisible by 3";
	}
	else
	{
		return "Its not divisible by 3";
	}

	
	
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner (System.in);
	System.out.println("Give two integers");
	int a= sc.nextInt();
	int b= sc.nextInt();
	System.out.println(multDiv3(a, b));
	


		
	}
}
