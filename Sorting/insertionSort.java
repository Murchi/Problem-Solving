import java.io.*;

import java.util.*;

public class insertionSort {

	public static void main(String args[]){
	int arr[] = new int[]{88,11,44,99,33};

	for(int i =1;i<arr.length;i++){
		int j ;
		int val = arr[i];
		for(j = i-1;j>=0;j--){
			if(arr[j]>val){
			arr[j+1]=arr[j];
			}
			else {
				break;
			}
			
		}
		arr[j+1]=val;
	}

	for(int i =0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
}

	

} 
