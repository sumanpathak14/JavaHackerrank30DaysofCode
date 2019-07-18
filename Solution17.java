import java.util.Scanner;

class Calculator{
	
	int power(int x,int y) throws Exception{
		
		if(x<0 || y<0) {
			throw new Exception("n and p should be non-negative");
		}
		
		double result=0;
		
		result=Math.pow(x, y);
		return (int) result;
	}
}

class Solution17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int p=sc.nextInt();
			
			Calculator myCalc=new Calculator();
			try {
				
				int ans=myCalc.power(n,p);
				System.out.println(ans);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		sc.close();

	}

}
