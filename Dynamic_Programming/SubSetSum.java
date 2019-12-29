import java.io.*;
import java.util.*;



public class SubSetSum {

	public static boolean isSubsetPresent(int [] input , int len , int sum) {

		boolean res[][] = new boolean[len+1][sum+1];
		
			
		for(int i =0 ;i<=len;i++)
			res[i][0]=true;
		for(int j =0;j<=sum;j++)
			res[0][j]=true;


		for(int i =1;i<=len;i++) {

			for(int j=1;j<=sum;j++) {

				if(input[i-1]>j)
				res[i][j] = res[i-1][j];

				else 
				res[i][j] = res[i-1][j] || res[i-1][j-input[i-1]];
			}
		}

		return res[len][sum];
	}

	public static void main(String args[]) {
	int input[] = new int[] {3, 34, 4, 12, 5, 2};
	int sum = 9;
	System.out.println(isSubsetPresent(input, input.length,sum));
	}

}
