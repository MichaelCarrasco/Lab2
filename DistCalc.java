import java.util.Scanner; //Imports scanner class
public class DistCalc {

	public static void main(String[] args) {
		Scanner coordinate = new Scanner(System.in);
		System.out.println("Enter first coordinates: ");
		double XOne = coordinate.nextDouble(); //User input for first x coordinate
		double YOne = coordinate.nextDouble(); //User input for first y coordinate
		System.out.println("Enter second coordinates: ");
		double XTwo = coordinate.nextDouble(); //User input for first x coordinate
		double YTwo = coordinate.nextDouble(); //User input for first y coordinate
		double Distance = Math.sqrt((Math.pow(XTwo-XOne, 2)+(Math.pow(YTwo-YOne, 2)))); //Calculates distance using formula
		System.out.format("Distance is %.3f ", Distance);
		coordinate.close();
		

	}

}
