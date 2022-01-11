import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand_num1=rand.nextInt(10);
		System.out.println(rand_num1);
		Random rand2= new Random();
		int rand_num_2=rand.nextInt(100)+1;
		System.out.println(rand_num_2);
		Random rand3=new Random();
		double rand_num3=rand.nextDouble()+2.5;
		System.out.println(rand_num3);
		Random rand4=new Random();
		double rand_num4=rand.nextDouble()+14+rand.nextInt(575);
		System.out.println(rand_num4);
	}
}
