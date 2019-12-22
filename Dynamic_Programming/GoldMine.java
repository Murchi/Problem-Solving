/* Ref : GeeksForGeeks 
Question : 
Gold Mine Problem

Given a gold mine of n*m dimensions. Each field in this mine contains a positive integer which is the amount of gold in tons. Initially the miner is at first column but can be at any row. He can move only (right->,right up /,right down\) that is from a given cell, the miner can move to the cell diagonally up towards the right or right or diagonally down towards the right. Find out maximum amount of gold he can collect.  */


import java.io.*;
import java.util.*;


class GoldMine {

public static int getMaxGold(int [][] gold,int m ,int n) {

	int table[][] = new int[m][n]; 
          
        for(int[] rows:table) 
            Arrays.fill(rows, 0); 

	for(int col = n-1; col >=0; col--) {
		
		for(int row =0;row<m;row++) {
			
			int right = (col==n-1) ? 0 : table[row][col+1];
			int right_up = (col == n-1 || row == 0) ? 0 : table[row-1][col+1];
			int right_down = (col == n-1 || row == m-1) ? 0 : table[row+1][col+1];	
			

			table[row][col] = gold[row][col]+ Math.max(right,Math.max(right_up,right_down));


	
		}
	}


	                int res = table[0][0];

                        for(int i=1;i<m;i++) {

                                res = Math.max(res,table[i][0]);
                        }
			
			return res;

}


	public static void main(String args[]) {

		int gold[][]= { {1, 3, 1, 5}, 
                        {2, 2, 4, 1}, 
                        {5, 0, 2, 3}, 
                        {0, 6, 1, 2} }; 
                          
        int m = 4, n = 4; 
          
        System.out.print(getMaxGold(gold, m, n)); 
	}

} 
