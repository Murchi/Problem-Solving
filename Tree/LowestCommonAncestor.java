import java.io.*;
import java.util.*;


class LowestCommonAncestor {

static class Node {

int data;
Node left;
Node right ;

Node(int data) {

this.data = data;

}

}

static Node root;

public static Node findLCA(Node root, int a , int b) {
	
	if(root == null)
	return null;
	
	if(root.data == a || root.data == b) {
		
		return root;
	}

	Node left = findLCA(root.left,a,b);
	Node right = findLCA(root.right,a,b);
	if(left !=null && right!=null){
		
		return root;
	}
	if(left == null && right == null)
	{
		return null;
	}

	return left !=null ? left : right;

}

public static void main(String args[]) {

	root = new Node(3);
	root.left = new Node(6);
	root.right = new Node(8);
	root.left.left = new Node(2);
	root.left.right = new Node(11);
	root.left.right.left = new Node(9);
	root.left.right.right = new Node(5);
	root.right.right = new Node(8);
	root.right.right.left = new Node(7);
	Node res = findLCA(root,2,8);
	System.out.println(res.data);

}


}
