import java.io.*;
import java.util.*;


public class CoinChange {

	static long countWays(int arr[],int m,int n) {


	int[][]resArray = new int[m+1][n+1];
	for(int i=0;i<=m;i++) 
		resArray[i][0]=1;
	for(int j=0;j<=n;j++)
		resArray[0][j]=0;

	for(int i=1;i<=m;i++){

		for(int j=1;j<=n;j++) {
		
			if(arr[i-1]>j){
			
				resArray[i][j]= resArray[i-1][j];
			}
			else {
		
				resArray[i][j]= resArray[i-1][j]+resArray[i][j-arr[i-1]];
			}

		}
	}

	return resArray[m][n];
}

	public static void main(String args[]) {

		int arr[] = { 2, 5,3,6}; 
        	int m = arr.length; 
        	int n = 10; 	
		System.out.println(countWays(arr, m, n));
	}

}
