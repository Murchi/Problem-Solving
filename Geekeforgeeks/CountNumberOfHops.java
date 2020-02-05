/*A frog jumps either 1, 2 or 3 steps to go to top. In how many ways can it reach the top.

Input:
The first line of input contains an integer T denoting the number of test cases. 
T testcases follow. Each testcase contains one line of input N denoting the total number of steps.

Output:
For each testcase, in a new line, print the number of ways to reach the top. */


import java.util.*;
import java.lang.*;
import java.io.*;

class CountNumberOfHops {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t!=0) {
		    int n = sc.nextInt();
		    int[] res= new int[n+1];
		    if(n==1){
		        System.out.println("1");
		    }
		    else if(n==2){
		        System.out.println("2");
		    }
		    else if(n == 3){
		        System.out.println("4");
		    }
		    else {
		    res[1]=1;
		    res[2]=2;
		    res[3]=4;
		    
		    for(int i=4;i<=n;i++){
		        res[i]=res[i-1]+res[i-2]+res[i-3];
		    }
		    
		    System.out.println(res[n]);
		    }
		    t--;
		}
	}
}
