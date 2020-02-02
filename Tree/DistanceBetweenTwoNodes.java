import java.io.*;
import java.util.*;


public class DistanceBetweenTwoNodes {

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

public static Node findLCA(Node root, int a,int b) {

if(root == null)
	return null;


if(root.data == a || root.data == b) {
	
	return root;

}

Node left = findLCA(root.left,a,b);
Node right = findLCA(root.right,a,b);

if(left!=null && right!=null)
	return root;

if(left == null && right ==null) 	
	return null;

return left!=null ? left:right;

}

public static int findLevel(Node root, int a,int level) {

if(root == null)
	return -1;
if(root.data==a){

	return level;
}

int l = findLevel(root.left,a,level+1);
if(l==-1) {
	
	return findLevel(root.right,a,level+1);

}
return l;



}

public static int findDistance(Node root, int a,int b) {

Node temp = findLCA(root,a,b);

int d1 = findLevel(temp,a,0);
int d2 = findLevel(temp,b,0);

return d1+d2;


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
        int  res = findDistance(root,9,5);
        System.out.println(res);	

}

}
