import java.io.*;
import java.util.*;

class letterCombination {
    
    public static List<String> letterCombinationHelper(int[] number, int n, String[] table){
        List<String> list = new ArrayList<String>();
        
        
        Queue<String>q = new LinkedList<>();
        q.add("");
        
        while(!q.isEmpty()){
            String s  = q.remove();
            
            if(s.length()== n){
                list.add(s);
            }
            else {
                String val = table[number[s.length()]];
                for(int i =0;i<val.length();i++){
                    q.add(s+val.charAt(i));
                }
            }
        }
        return list;
    }
    
    public static List<String> letterCombinations(String digits) {
        ArrayList<String>result = new ArrayList<String>();
        if(digits.length()== 0){
            return result;
        }
        String table[]  = new String[] {"" ,"", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
        int n = digits.length();
        int[] number = new int[n];
        
        for(int i =0;i<n;i++){
            number[i] = Integer.parseInt(String.valueOf(digits.charAt(i)));
        }
        
        return letterCombinationHelper(number,n,table);
        
    }

public static void main(String args[]){
	List<String> lis = new ArrayList<String>();
	lis = letterCombinations("23");
	for(int i =0;i<lis.size();i++){
		System.out.print(lis.get(i)+" ");
	}

}
}
