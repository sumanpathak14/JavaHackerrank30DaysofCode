import java.util.*;

class Printer<T>{
	
	void printArray(T[] test) {
		for(int i=0;i<test.length;i++) {
			System.out.println(test[i]);
		}
	}
}
public class Solution21 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		Integer[] intArrary=new Integer[n];
		for (int i=0;i<n;i++) {
			intArrary[i]=scanner.nextInt();
		}
		
		n=scanner.nextInt();
		String[] stringArray=new String[n];
		for (int i=0;i<n;i++) {
			stringArray[i]=scanner.next();
		}
		
		Printer<Integer> intPrinter=new Printer<Integer>();
		Printer<String> stringPrinter=new Printer<String>();
		
		intPrinter.printArray(intArrary);
		stringPrinter.printArray(stringArray);
		
		if(Printer.class.getDeclaredMethods().length>1) {
			System.out.println("The Printer class should only have 1 method named printArray.");
		}
		
		scanner.close();
	}

}
