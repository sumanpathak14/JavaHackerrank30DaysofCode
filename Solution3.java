import java.util.*;


public class Solution3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		double meal_cost=scanner.nextDouble();
		int tip_percent=scanner.nextInt();
		int tax_percent=scanner.nextInt();
		scanner.close();
		
		double total_tip=meal_cost*tip_percent/100;
		double total_tax=meal_cost*tax_percent/100;
		double total_meal_cost = total_tip+total_tax+meal_cost;
		
		int total=(int)Math.round(total_meal_cost);
		System.out.println("The total meal cost is "+total+" dollars.");
		
		
	}

}
