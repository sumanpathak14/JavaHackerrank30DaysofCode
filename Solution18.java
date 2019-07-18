import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution18 {

	Stack<Character> st=new Stack<Character>();
	Queue<Character> q1=new LinkedList<Character>();
	
	void pushCharacter(char ch) {
		st.push(ch);
		
	}
	
	void enqueueCharacter(char ch) {
		q1.add(ch);
		
	}
	
	char popCharacter() {
		char ch1=st.pop();
		return ch1;
	}
	
	char dequeueCharacter() {
		char ch1=q1.element();
		q1.remove();
		return ch1;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		//Convert input string into an array of characters
		char[] s=input.toCharArray();
		
		//Create a solution object
		Solution18 p= new Solution18();
		
		//Enqueue/Push all chars to their respective data structures
		for(char c:s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		//Pop/Dequeue chars at the head of both data structures and compare them
		boolean isPalindrome=true;
		for(int i=0;i<s.length/2;i++) {
			if(p.popCharacter()!=p.dequeueCharacter()) {
				isPalindrome=false;
				break;
			}
		}
		
		//Finally print whether string s is a palindrome or not
		System.out.println("The word, "+input+", is "
				+((!isPalindrome)?"not a palindrome":"a palindrome."));
	}

}
