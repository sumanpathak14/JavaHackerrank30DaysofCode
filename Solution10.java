import java.util.*;


public class Solution10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=0;
		int sum=0; int max=0;
		n=in.nextInt();
		int remainder=0;
         
        while(n>0){
            remainder=n%2;
            
            if(remainder==1) {
            	sum++;
            	if(sum>max) {max=sum;}
            }else {
            	sum=0;
            }
            
            n=n/2;
            
        }
        
        System.out.println(max);

		in.close();
	}

	
}
