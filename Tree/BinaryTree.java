import java.io.*;
import java.util.*;


class Node {

	int key;
	Node left;
	Node right;

	Node(int key) {
		
		this.key = key;
		left=right=null;
	}
}

class BinaryTree {

Node root;


BinaryTree(int key) {

	root = new Node(key);
}

BinaryTree(){

	root = null;
}

public static void main(String args[]) {

	BinaryTree tree = new BinaryTree();

	tree.root = new Node(2);

	tree.root.left = new Node(3);

	tree.root.right = new Node(5);
}


}
