import java.util.Random;
import java.util.Scanner; //Imports scanner class
public class UserNames {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String First = name.nextLine(); //User input for first name
		System.out.print("Enter last name: ");
		String Last = name.nextLine(); //User input for last name
		Random rand= new Random();
		int num=rand.nextInt(90)+10; //Randomizes value from 10 to 99
		System.out.println(Last.substring(0, 4)+(First.substring(0,1))+ num); 
		//prints first four letters of last name, first letter of first name, and adds random number
		name.close();

	}

}
