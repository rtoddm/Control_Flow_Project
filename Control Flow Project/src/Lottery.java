import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static int handleOutOfRängeNumber(int number, int maxValue){
		while(number > maxValue) {
			number -= maxValue;
		}
		return number;
}
	
	public static void main(String[]args) {
		
	Scanner input = new Scanner(System.in);	
	
	System.out.println("Please enter your name:");
	String name = input.nextLine();
	
	System.out.println("Hello "+name);
	
	System.out.println("Do you wish to continue?");
	String answer = input.nextLine().toLowerCase();   
	boolean surveyCompleted = false;
	while(answer.equals("yes") || answer. equals("y"))
	
		System.out.println("What is the name of your favorite pet?");
		String petName = input.nextLine() ;
		
		System.out.println("What is the age of your favorite pet?");
		int petAge = Integer.parseInt(input.nextLine() ) ;
		
		System.out.println("What is your lucky number?");
		int luckyNumber = Integer.parseInt (input.nextLine()) ;
		
		System.out.println("Do you a favorite quarterback? (yes, no)");
		String response = input.nextLine().toLowerCase();
		boolean hasFavoriteQB = (response.equals("yes") || response.equals("y" ));
		
		
		it jerseyNumber=0;
		if (hasFavorite@B) {
			System.out.println("What is their jersey number?") ;
			jerseyNumber = Integer.parseInt (input.nextLine());
		}
		
		System.out.println("What is the two-digit model year of your car?");
		int carYear = Integer.parseInt(input.nextLine ()) ;
		
		System.out.println("What is the first name of your favorite actor or actress?")
		String favoritelhespian = input.nextLine();
		
		System.out.println("Enter a random number 1 and 50?") ;
		int randomNumber = Integer.parseInt (input.nextLine()) ;
		
		
		Random random = new Random();
		int[] randomIntegers = new int[3];
		for(int i=0; i<randomIntegers.length; ++i) {
			randomIntegers[i]=random.nextInt((MAX_NORMAL_BALL-MIN_NORMAL_BALL+1)+MIN_NORMAL_BALL;);
		}
		
		final int MIN_MAGIC_BALL = 1;
		final int MAX_MAGIC_BALL = 75;
		int MIN_NORMAL_BALL = 1;
		int MAX_NORMAL_BALL = 65;
		
	
		
		
		randomIntegers[i]=random.nextInt(MAX_NORMAL_BALL-MIN_NORMAL_BALL+1) +MIN_NORMAL_BALL;
	
		}
		
	}
		
		
