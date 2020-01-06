/* Question : Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.*/


import java.io.*;
import java.util.*;


public class LongestPalindromicSubstring {


public static String findLongest(String str) {

int maxLength =1;


int start =0;

int len = str.length();

if(len == 0 || len ==1)
return str;

int low;
int high;

for(int i =1;i<len;i++) {

	 low = i-1;
	 high =i;


	while(low>=0 && high < len && str.charAt(low)==str.charAt(high) ) {

		if(high-low+1 > maxLength) {
			maxLength = high-low+1;
			start = low;
		}
		--low;
		++high;		
	}


	low = i-1;
	high = i+1;

	while(low>=0 && high < len && str.charAt(low)== str.charAt(high)) {

		if(high-low+1 > maxLength) {

			maxLength = high-low+1;
			start = low;
		}
		--low;
		++high;
	}


	

}

return str.substring(start,maxLength);


}

public static void main(String args[]) {

System.out.println("Longest palindromic substring is : "+findLongest("babad"));

}

}
