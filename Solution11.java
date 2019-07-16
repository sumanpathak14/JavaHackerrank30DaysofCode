import java.util.Arrays;
import java.util.Scanner;

public class Solution11 {

	public static void main(String[] args) {
		int[][] arr=new int[6][6];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				
				arr[i][j]=in.nextInt();
			}
		}
		
		int h=0;
		int[] sum=new int[16];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				sum[h]=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				h++;
			}
		}
		
		in.close();
		Arrays.sort(sum);
		System.out.println(sum[15]);
		

	}

}
