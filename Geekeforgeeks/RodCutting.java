/*Given an integer N denoting the Length of a line segment. you need to cut the line segment in such a way that the cut length of a line segment each time is integer either x , y or z. and after performing all cutting operation the total number of cutted segments must be maximum. 


Input
First line of input contains of an integer 'T' denoting number of test cases. First line of each testcase contains N . Second line of each testcase contains 3 space separated integers x , y and z.

Output
For each test case print in a new line an integer corresponding to the answer */



import java.util.*;
import java.lang.*;
import java.io.*;

class RodCutting {
	public static void main (String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		   int t = sc.nextInt();
		   
		   while(t!=0) {
		       int n = sc.nextInt();
		       int arr[] = new int[4];
		       arr[0]=0;
		       for(int i =1;i<=3;i++)
		        arr[i] = sc.nextInt();
		        
		        int[][]dp = new int[4][n+1];
		        
		        for(int i =1;i<=3;i++) {
		            dp[i][0]=1;
		        }
		        for(int j=0;j<=n;j++){
		            dp[0][j]=0;
		        }
		        
		        for(int i =1 ;i<=3;i++){
		            for(int j=1;j<=n;j++){
		                if(arr[i]>j){
		                    dp[i][j]= dp[i-1][j];
		                }
		                else {
		                    int k = dp[i][j-arr[i]];
		                    if(k!=0 && j-arr[i]!=0) {
		                    k=k+1;
		                    }
                            dp[i][j]=Math.max(k,dp[i-1][j]);
                            
		                }
		            }
		        }
		        System.out.println(dp[3][n]);
		        t--;
		   }
	}
}
