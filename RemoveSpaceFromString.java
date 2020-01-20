import java.io.*;
import java.util.*;


class RemoveSpaceFromString {

	public static int removeSpace(char[] str) {
		
		int count =0;
		for(int i=0;i<str.length;i++) {
			if(str[i] != ' '){

				str[count]=str[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {

		String s = "r  emove extra space fro m me";
		char str[] = s.toCharArray();

		int i = removeSpace(str);
		System.out.print(String.valueOf(str).subSequence(0,i));
		System.out.println();
	}

}
