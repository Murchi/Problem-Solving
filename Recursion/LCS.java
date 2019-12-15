import java.io.*;
import java.util.*;

class LCS {


static int findLcs(String X,String Y, int m,int n) {
if(m==0 || n==0){
return 0;
}

if(X.charAt(m-1)==Y.charAt(n-1))
return findLcs(X,Y,m-1,n-1)+1;



return Integer.max(findLcs(X,Y,m-1,n),findLcs(X,Y,m,n-1));

}


public static void main(String args[]){

String X = "ABCBDAB", Y = "BDCABA";
int result = findLcs(X,Y,X.length(),Y.length());
System.out.println(result);


}

}
