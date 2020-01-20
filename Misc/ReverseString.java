import java.io.*;
import java.util.*;


class ReverseString {
	public static void main(String args[]) {
	String s = "reverse me if you can";
	String ans = "";
	String rev [] =s.split(" ");
	for(int i = rev.length-1; i>=0; i--) {

		ans += rev[i]+" ";
	} 

	System.out.println(ans.substring(0,ans.length()));
}

} 
