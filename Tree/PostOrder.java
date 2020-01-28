import java.io.*;
import java.util.*;


class PostOrder {

	static class Node {

		int data;
		Node left ;
		Node right;
		
		Node(int data) {


			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}

static Node root;

public static void postorder_traversal(Node root) {

	if(root == null)
		return;
	postorder_traversal(root.left);
	postorder_traversal(root.right);
	System.out.print(root.data+" ");

}

public static void main(String args[]) {
	
	root = new Node(1);
	root.left = new Node(2);
	root.right = new Node(3);
	root.right.left = new Node(5);
	root.right.right = new Node(7);
	postorder_traversal(root);
}


}
