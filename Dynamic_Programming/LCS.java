import java.io.*;
import java.util.*;



class LCS {


static int findLcs(String X,String Y,int m,int n,Map<String,Integer>map) {

if(m==0 || n==0){
return 0;
}


String key = m + "|" + n;

if(!map.containsKey(key)){

if(X.charAt(m-1)==Y.charAt(n-1)) {

map.put(key,findLcs(X,Y,m-1,n-1,map)+1);
}

else {
map.put(key,Integer.max(findLcs(X,Y,m-1,n,map),findLcs(X,Y,m,n-1,map)));

}


}

return map.get(key);
}

public static void main(String args[]){

String X = "ABCBDAB", Y = "BDCABA";

Map<String,Integer>map= new HashMap<String,Integer>();

System.out.println("LCS is "+findLcs(X,Y,X.length(),Y.length(),map));

}

}
