import java.io.*;
import java.util.*;


class PreOrder {

	static class Node {


		int data;
		Node left;
		Node right;

		Node(int data) {

			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

public static void preorder_traversal(Node root) {

	if(root == null)
	return;

	System.out.print(root.data+" ");
	preorder_traversal(root.left);
	preorder_traversal(root.right);

}

static Node root;

public static void main(String args[]) {

	root = new Node(1);
	root.left = new Node(2);
	root.right = new Node(3);
	root.right.left = new Node(5);
	root.right.right = new Node(7);
	preorder_traversal(root);
}

}
