import java.io.*;
import java.util.*;

public class LongestCommonSubstring {


public static int findlength(String x, String y , int len1, int len2) {

int res[][] = new int[len1+1][len2+1] ;

for(int i =0; i<=len1;i++) {
	res[i][0]=0;

}

for(int j =0;j<=len2;j++)
	res[0][j]=0;




for(int i =1;i<=len1;i++) {

	for(int j =1 ;j<=len2;j++) {

		if(x.charAt(i-1)==y.charAt(j-1)) 
			res[i][j]= res[i-1][j-1]+1;
		else 
			res[i][j]=0;
	}

}


int max =0;


for(int i=0;i<=len1;i++) {

	for(int j=0;j<=len2;j++) {

	if(max<res[i][j])
	max = res[i][j];
}
}

return max;
}

public static void main(String args[]) {

	String x = "abcdaf";
	String y = "zbcdf";


	System.out.println("length of Longest Common Substring is "+findlength(x,y,x.length(),y.length()));

	

}

}
