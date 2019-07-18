import java.util.*;

public class Solution28 {

	public static boolean isPrime(int n) {
		
		for (int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++) {
			int n=sc.nextInt();
			
			if(n>=2 && isPrime(n)) {
				System.out.println("Prime");
			}
			else System.out.println("Not prime");
		}
		
		sc.close();
	
	}

}
