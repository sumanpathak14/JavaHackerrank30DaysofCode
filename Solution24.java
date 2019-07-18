import java.util.Scanner;

class Node4{
	int data;
	Node4 next;
	Node4(int d){
		data=d;
		next=null;
	}
}

public class Solution24 {

	public static Node4 removeDuplicates(Node4 head) {
		Node4 start=head;
		
		
		while(start!=null && start.next!=null) {
						
			while(start.next!=null&&start.data==start.next.data) {
				start.next=start.next.next;
			}
			start=start.next;
		}
		return head;
	}
	
	public static Node4 insert(Node4 head,int data) {
		Node4 p=new Node4(data);
		if(head==null) {
			head=p;
		}else if (head.next==null) {head.next=p;}
		else {
			Node4 start=head;
			while(start.next!=null) {
				start=start.next;
			}
			start.next=p;
		}
		return head;
	}
	
	public static void display(Node4 head) {
		Node4 start=head;
		while(start!=null) {
			System.out.print(start.data+" ");
			start=start.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node4 head=null;
		int T=sc.nextInt();
		while(T-->0) {
			int ele=sc.nextInt();
			head=insert(head,ele);
		}
		
		head=removeDuplicates(head);
		display(head);
		
		sc.close();
		
	}

}
