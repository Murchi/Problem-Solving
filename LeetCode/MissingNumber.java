/*question : Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
find the one that is missing from the array. */


import java.io.*;
import java.util.*;



public class MissingNumber {

public static int findmissingNumber(int[]  nums) {

	  if(nums.length == 0)
            return 0;
        
        
            int max = nums.length;
            int sum =0;
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];
           
        }
        
        int nsum = (max*(max+1))/2;
        int res = (nsum - sum);
        return res;

}


public static void main(String args[]) {


	int arr[] = new int[] {9,6,4,2,3,5,7,0,1};
	System.out.println("The missing number is  : "+findmissingNumber(arr));

}

}



