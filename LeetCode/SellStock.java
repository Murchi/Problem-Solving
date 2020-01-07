/*Question : 

*/

import java.io.*;
import java.util.*;

public class SellStock {

public static int maxProfit(int[] prices) {

if(prices.length == 0) {
            return 0;
        }
        int max =0;
        int sub =0;
        for(int i=1;i<prices.length;i++) {
            for(int j=0;j<i;j++) {
                if(prices[i]>prices[j]){
                    sub = prices[i]-prices[j];
                    if(max < sub)
                        max = sub;
                }
            }
        }
        return max;

}

public static void main(String args[]) {

	int prices[] = new int[] {7,1,5,3,6,4};
	System.out.println("Maximum profit "+maxProfit(prices));

}

}
