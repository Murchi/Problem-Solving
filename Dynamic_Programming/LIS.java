//Problem to find the longest increasing subsequence//

import java.io.*;
import java.util.*;

class LIS {

public static int lis(int[] arr,int len) {
int lis[] = new int[len];
for(int i=0;i<len;i++) {
lis[i]=1;
}
for(int i=1;i<len;i++) {
for(int j=0;j<i;j++) {
	//check for lis[i]<lis[j] is made in order to check if after including the current element the 
	//length decreases, if yes then do not condisder adding that length
	if(arr[j]<arr[i] && lis[i]<lis[j]+1) {
		lis[i]=lis[j]+1;
	}
}
}

int max=0;
for(int i=0;i<len;i++) {

if(lis[i]>max) {
	max = lis[i];
}
}

return max;

}

public static void main(String args[]) {

int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
int len = arr.length;
System.out.println("Length of longest increasing subsequence is "+lis(arr,len));
}

}
