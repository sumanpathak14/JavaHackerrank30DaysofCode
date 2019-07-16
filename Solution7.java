import java.util.*;

public class Solution7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int[] arr=new int[N];
		scan.nextLine();
		String[] arrItems=scan.nextLine().split(" ");
		for (int i=0;i<N;i++)
		{
			int arrItem=Integer.parseInt(arrItems[i]);
			arr[i]=arrItem;
		}
		for (int j=N-1;j>=0;j--)
		{
			System.out.print(arr[j]+" ");
		}
		
		scan.close();

	}

}
