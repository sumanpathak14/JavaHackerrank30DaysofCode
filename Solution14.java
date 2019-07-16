import java.util.*;


class Difference{
	
	private int[] elements;
	public int maximumDifference;
	public Difference(int[] a) {
	 elements=a;	
	}
	
	public void computeDifference() {
		int max=0;
		int min=elements[0];
			for(int i=0;i<elements.length;i++) {
				if(elements[i]>max) {
					max=elements[i];
				}
				else if(elements[i]<min) {
					min=elements[i];
				}
			}	
			System.out.println("max-"+max);
			System.out.println("min-"+min);
			maximumDifference=Math.abs(max-min);
	}
}


public class Solution14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		
		Difference difference=new Difference(a);
		
		difference.computeDifference();
		System.out.println(difference.maximumDifference);
	}

}
