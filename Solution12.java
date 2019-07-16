import java.util.*;

class Person1{
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	Person1(String firstName, String lastName, int idNumber) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}
	
	public void printPerson() {
		System.out.println(
				"Name: "+lastName+", "+firstName+"\nID: "+idNumber);
	}
	
}

class Student extends Person1{

	private int[] testScores;
	Student(String firstName, String lastName, int idNumber,int[] testScores) {
		super(firstName, lastName, idNumber);
		this.testScores=testScores;
		
	}
	
	public char calculate() {
		int sum=0;
		int average=0;
		char grade=' ';
		for(int i=0;i<testScores.length;i++) {
			sum=sum+testScores[i];
		}
		
		average=sum/testScores.length;
		
		
		if(average>=90&&average<=100) {grade='O';return grade;}
		else if(average>=80&&average<=90) {grade='E';return grade;}
		else if(average>=70&&average<=80) {grade='A';return grade;}
		else if(average>=55&&average<=70) {grade='P';return grade;}
		else if(average>=40&&average<=55) {grade='D';return grade;}
		else if(average<40) {grade='T';return grade;}
		
		return grade;
	}
}

public class Solution12 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String firstName=scan.next();
		String lastName=scan.next();
		int id=scan.nextInt();
		int numScores=scan.nextInt();
		int[] testScores=new int[numScores];
		for(int i=0;i<numScores;i++) {
			testScores[i]=scan.nextInt();
		}
		scan.close();
		
		Student s=new Student(firstName, lastName, id,testScores);
		s.printPerson();
		System.out.println("Grade: "+s.calculate());
	}

}
