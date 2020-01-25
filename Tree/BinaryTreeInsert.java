import java.io.*;
import java.util.*;

public class BinaryTreeInsert {

static class Node {

	int data;
	Node left;
	Node right;

	Node(int x) {

		data =x;
		this.left = null;
		this.right = null;
	}
}


static Node root;
static Node temp = root;

public static void insert(Node temp,int key) {
	
	Queue<Node>q = new LinkedList<Node>();
	q.add(temp);

	while(!q.isEmpty()) {

		temp = q.peek();
		q.remove();
		if(temp.left == null) {

			temp.left = new Node(key);
			break;
		}
		else {
			q.add(temp.left);
		}

		if(temp.right == null) {

			temp.right = new Node(key);
			break;
		}
		else {
			q.add(temp.right);
		}
		
	}
	
}

public static void inorder(Node root) {

	if(root == null)
		return;

	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
	
}

public static void main(String args[]) {

	root = new Node(10);
	root.left = new Node(11);
	root.right = new Node(12);
	insert(root,13);
	inorder(root);

}


}
