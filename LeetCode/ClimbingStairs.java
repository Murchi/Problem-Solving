
/* Question : You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? */

import java.io.*;
import java.util.*;


public class ClimbingStairs {

public static int climbStairs(int n) {

	 int res[] = new int[n+1];
        res[0]=1;
        res[1]=1;
    for(int i=2;i<=n;i++) {
        res[i]= res[i-1]+res[i-2];
    }
        return res[n];

}


public static void main(String args[]) {
	
	System.out.println(climbStairs(3));

}


}
