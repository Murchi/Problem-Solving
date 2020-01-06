/*Question : Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum. */


import java.io.*;
import java.util.*;


public class MaximumSubarray {


 public static  int maxSubArray(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        int maxSum =nums[0];
        int tempSum =nums[0];
        
        for(int i=1;i<nums.length;i++) {
            tempSum = Math.max(nums[i],tempSum+nums[i]);
            maxSum = Math.max(maxSum,tempSum);
        }
        return maxSum;
    }

public static void main (String args[]) {

	int nums[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};
	System.out.println("Maximum sum is "+maxSubArray(nums));

}

}
