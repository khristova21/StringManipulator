import java.util.Scanner;

public class MainManipulator 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		StringManipulator changer = new StringManipulator();
		boolean play = true;
		while(play)
		{
			
			System.out.print("If you'd like to run the no vowels method type 1...\nIf you want to run the reverse method type 2: ");
			int run = in.nextInt();
			in.nextLine();
			while(run != 1 &&  run !=2)
			{
				System.out.print("Sorry, that is not a 1 or a 2. Please enter 1 for no vowels, or 2 for reverse: ");
				run = in.nextInt();
				in.nextLine();
				
			}
			
			if (run == 1) //novowels
			{	
				System.out.print("Enter a word you'd like to use: ");
				String originalStr =in.nextLine();
				System.out.println(changer.noVowels(originalStr));
			}
			else //reverse
			{
				System.out.print("Enter a word or phrase you'd like to use: ");
				String originalStr = in.nextLine();
				System.out.println(changer.reverse(originalStr));
			}
			//ask to play again
			System.out.print("\nDo you want to try again(y/n)?");
			String answer = in.next();
			
			if (answer == "y")
			{
				play = true;
			}
			else
				play = false;
	
			//still loops  with the while
	}
	}
}
