import java.util.Scanner; //Imports scanner class
import java.util.Random; //Imports random number generator
public class AgeGuessModified {

	public static void main(String[] args) {
		Scanner guess = new Scanner(System.in);
		System.out.print("Enter String Name: ");
		String userName = guess.nextLine(); //user input for name
		System.out.print("Enter age guess: ");
		String ageGuess = guess.nextLine(); //user input for age
		System.out.println("Name is: " + userName);
		System.out.println("Age guess is: " + ageGuess);
		Random rand= new Random();
		int age=rand.nextInt(101); //Randomizes value from 0 to 100
		System.out.println("Actual age is " + age);
		guess.close();
		
	}
}