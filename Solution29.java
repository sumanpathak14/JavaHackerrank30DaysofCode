import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution29 {

	static boolean MatchEmail(Pattern p,String emailID) {
		boolean isMatch=false;
		Matcher m =p.matcher(emailID);
		if(m.find()) {
			isMatch=true;
			System.out.println(m.group(0));
		}
		return isMatch;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		String myRegExString = "[a-zA-Z]+@gmail.com";
		Pattern p=Pattern.compile(myRegExString);
		sc.nextLine();
		boolean isMatch=false;
		List<String> names=new ArrayList<String>();
		for(int NItr=0;NItr<N;NItr++) {
			String[] firstNameEmailID=sc.nextLine().split(" ");
			String firstName=firstNameEmailID[0];
			String emailID=firstNameEmailID[1];
			isMatch=MatchEmail(p, emailID);
			if(isMatch) {
				names.add(firstName);
			}
			
		}
		
		Collections.sort(names);
		if(names.size()>0) {
			for(String name:names) {
				System.out.println(name);
			}
		}
		sc.close();
	}

}
