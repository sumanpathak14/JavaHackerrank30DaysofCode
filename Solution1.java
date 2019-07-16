
import java.util.*;

public class Solution1 {

	public static void main(String[] args) {
		//Create a scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in);
		
		//Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine();
		
		//Close the scanner object, because we've finished reading
		//all of the input from stdin needed for this challenge.
		scan.close();
		
		//Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
		
		//Print the inputString's value here 
		System.out.println(inputString);

	}

}
