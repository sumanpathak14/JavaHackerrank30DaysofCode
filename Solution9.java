import java.util.*;

public class Solution9 {

	static int factorial(int n) {
		
		if(n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		int result =factorial(n);
		
		System.out.println(result);
		in.close();

	}

}
