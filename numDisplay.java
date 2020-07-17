import java.util.Scanner; //Imports scanner class
public class numDisplay {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Enter a number between 0 to 9: ");
		int num = number.nextInt(); //user input for number
		switch (num) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
			default:
				System.out.println("Wrong number entered"); //Output if number not in range entered
			
		}
		number.close();

	}

}
