import java.util.*;


public class Solution2 {

	public static void main(String[] args) {
		int i=4;
		double d = 4.0;
		String s = "HackerRank ";
		
		int j;
		double e;
		String t;
		
		//Create a scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in);
		
		//take inputs and assign it to newly created variables
		j=scan.nextInt();
		e=scan.nextDouble();
		scan.nextLine();
		t=scan.nextLine();
		//t=scan.nextLine();
		
		//add or concatenate the numbers and strings, later print them 
		System.out.println(i+j);
		System.out.println(d+e);
		System.out.println(s+t);
		
		scan.close();
	}

}
