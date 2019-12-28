/* reference : geeksForGeeks 
Question : Given a value V, if we want to make change for V cents, and we have infinite supply of each of C = { C1, C2, .. , Cm} valued coins, what is the minimum number of coins to make the change?  */



import java.io.*;
import java.util.*;


public class MinCoins {


public static int mincoin(int[]coins, int m, int value) {

int res[][] = new int[m+1][value+1];

int val =1;

for(int i =0;i<=m;i++) 
	res[i][0]=0;

for(int j = 1;j<=value;j++) {

	res[0][j] =val;
	val++; 
}


for(int i=1;i<=m;i++) {

	for(int j=1;j<=value;j++) {

		if(coins[i-1]>j) 
			res[i][j]=res[i-1][j];

		else {

			res[i][j] = Math.min(res[i-1][j], res[i][j-coins[i-1]]+1);
		}
	}
}
return res[m][value];

}

public static void main(String args[]) {

int [] coins = new int[] {1,5,6,8};
int m = coins.length;


int val = 11;

System.out.println("The minimum number of coins required "+mincoin(coins,m,val));

}

}
