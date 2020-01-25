import java.io.*;
import java.util.*;


public class PrintLeftView {

	static class Node {

		int data;
		Node left;
		Node right;

		Node(int data)	{

			this.data = data;
			this.left = null;
			this.right = null;
		}
	}


	static Node root;
	static void printLeft(Node root) {

		Queue<Node>q = new LinkedList<Node>();
		q.add(root);

		while(!q.isEmpty()) {

			Node temp = q.poll();
			System.out.print(temp.data+" ");
			if(temp.left !=null) {

				q.add(temp.left);
			}
		}
	}


	public static void main(String args[]) {
		
		root = new Node(1);
		root.left = new Node(5);
		root.right = new Node(10);
		root.left.left = new Node(3);
		root.left.right = new Node(9);
		printLeft(root);
	}

}





