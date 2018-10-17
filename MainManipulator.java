import java.util.Scanner;

public class MainManipulator 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		StringManipulator changer = new StringManipulator();
		int play = 0;
		if (play == 0)
			
			System.out.print("If you'd like to run the no vowels method type 1...\nIf you want to run the reverse method type 2: ");
			int run = in.nextInt();
			in.nextLine();
			
			if (run== 1) //novowels
			{	
				System.out.print("Enter a word you'd like to use: ");
				String originalStr =in.next();
				in.nextLine();
				System.out.println(changer.noVowels(originalStr));
			}
			else //reverse
			{
				System.out.print("Enter a word or phrase you'd like to use: ");
				String originalStr = in.next();
				in.nextLine();
				System.out.println(changer.reverse(originalStr));
			}
			//ask to play again
			System.out.print("\nIf you'd like to play again type 0, otherwise thank you!");
			if (in.nextInt() != 0)
			{
				System.out.println("Have a nice day!");
			}
	}

}
