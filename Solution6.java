import java.util.*;

public class Solution6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int I=scan.nextInt();
		String input="";
		scan.nextLine();
		
		for(int i=0;i<I;i++) {
			input=scan.nextLine();
			char[] cArr=input.toCharArray();
			for (int j=0;j<cArr.length;j++) {
				if(j==0 || j%2==0) {
					System.out.print(cArr[j]);
				}
			}
			System.out.print(" ");
			for (int j=0;j<cArr.length;j++) {
				if(j%2!=0) {
					System.out.print(cArr[j]);
				}
			}
			System.out.println();
		}
		scan.close();

	}

}
