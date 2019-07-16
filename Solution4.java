import java.util.*;

public class Solution4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		scan.close();
		
		
		if(N%2!=0) {
			System.out.println("Weird");
		}
		else if(N%2==0 && N>=2 && N<=5){
			System.out.println("Not Weird");
		}
		else if(N%2==0 && N>=6 && N<=20){
			System.out.println("Weird");
		}
		else if(N%2==0 && N>20){
			System.out.println("Not Weird");
		}
	}

}
