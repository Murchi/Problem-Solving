/*Given an array of integers of size ‘n’. calculate the maximum sum possible for ‘k’ consecutive elements in the array.
Input :array : {100,200,300,400} k = 2
Output : 700
*/



import java.io.*;
import java.util.*;

public class MaximumSum {

public static int calculateMaxSum(int arr[],int k) {

int max_sum =0;
int curr_sum =0;

//calculate sum of first window
for(int i=0;i<k;i++) {
	curr_sum+=arr[i];
}


for(int i=k;i<arr.length;i++){
curr_sum+=arr[i]-arr[i-k];
max_sum = Math.max(max_sum,curr_sum);
}

return max_sum;

}

public static void main(String args[]) {
	int arr[] = {100,200,300,400};
	int k=2;
	int result  = calculateMaxSum(arr,k);
	System.out.println(result);
}

} 
