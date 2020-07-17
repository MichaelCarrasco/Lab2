
public class FloatEqu {
	
	public static void main(String[] args) {
		double a = ((1.0/10) * (1.0/10));
		double b = (1.0/100);
		if (a==b) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		if (Math.abs(a - b) < .000001) {
			 System.out.println ("Essentially equal");
		}

	}
}

