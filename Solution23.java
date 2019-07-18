import java.util.*;

class Node3{
	Node3 left, right;
	int data;
	Node3(int data) {
		this.data=data;
		left=null;
		right=null;
	}
}
public class Solution23 {

	static void levelOrder(Node3 root) {
		Queue<Node3> queue=new LinkedList<Node3>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node3 cur=queue.remove();
			System.out.println(cur.data+" ");
			
			if(cur.left!=null) {queue.add(cur.left);}
			if(cur.right!=null) {queue.add(cur.right);}
		}
	}
	
	public static Node3 insert(Node3 root, int data) {
		if(root==null) {return new Node3(data);}
		else {
			Node3 cur;
			if(data<=root.data) {
				cur=insert(root.left,data);
				root.left=cur;
			}
			else {
				cur=insert(root.right,data);
				root.right=cur;
			}
			return root;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		Node3 root= null;
		while(T-->0) {
			int data=sc.nextInt();
			root=insert(root,data);
		}
		
		levelOrder(root);
		sc.close();

	}

}
