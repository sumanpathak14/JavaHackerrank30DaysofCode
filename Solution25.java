import java.util.*;

public class Solution25 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int return_day=sc.nextInt();
		int return_month=sc.nextInt();
		int return_year=sc.nextInt();
		
		int exreturn_day=sc.nextInt();
		int exreturn_month=sc.nextInt();
		int exreturn_year=sc.nextInt();
		
		int fine=0;
		
		if(return_year==exreturn_year) {
			if(return_month==exreturn_month) {
				if(return_day==exreturn_day) {
					fine=0;
				}
				else if(return_day<exreturn_day) {
					fine =0;
				}
				else {
					fine=15*(return_day-exreturn_day);
				}
			}
			else if(return_month<exreturn_month) {
				fine =0;
			}
			else {
				fine=500*(return_month-exreturn_month);
			}
		}
		else if(return_year<exreturn_year){
			fine =0;
		}
		else
		{
			fine=10000;
		}
		
		System.out.println(fine);
		sc.close();
	}

}
