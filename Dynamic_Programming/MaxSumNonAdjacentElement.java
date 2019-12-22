/* Maximum sum such that no two elements are adjacent*/

import java.io.*;
import java.util.*;



class MaxSumNonAdjacentElement {


static int findMaxSum(int arr[]) {

	int n = arr.length;
	int incl=arr[0];
	int excl = 0;

	for(int i=1;i<n;i++) {
		int temp = incl;
		incl = Math.max(incl,excl+arr[i]);
		excl = temp;
	}

	return incl;
}

public static void main(String args[]) {
	
	int arr[] = {5, 5, 10, 100, 10, 5};
	System.out.println("Max sum is "+findMaxSum(arr));
}

}
