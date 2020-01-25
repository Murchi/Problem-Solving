import java.io.*;
import java.util.*;


public class LevelOrder {

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

static Node root;

public static void levelOrder(Node root) {

	Queue<Node>q = new LinkedList<Node>();
	q.add(root);

	while(!q.isEmpty()) {

		Node temp = q.poll();
		System.out.print(temp.data+" ");

		if(temp.left !=null) {
			q.add(temp.left);
		}
		
		if(temp.right !=null) {
			q.add(temp.right);
		}
	}

}


public static void main(String args[]) {

	root = new Node(12);
	root.left = new Node(10);
	root.right = new Node(20);
	root.left.left = new Node(1);
	levelOrder(root);

}

}
