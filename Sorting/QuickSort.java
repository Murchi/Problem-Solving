/*Quick sort last element is taken as pivot */

import java.io.*;
import java.util.*;

public class QuickSort {

	
	public static int partition(int arr[],int low,int high) {
		int pivot = arr[high];
		int i = low-1;
		for(int j =low;j<high;j++) {

			if(arr[j]<pivot){
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}

		int temp = arr[i+1];
		arr[i+1]=pivot;
		arr[high]=temp;
		return (i+1);
	}
	public static void quickSort(int arr[], int low,int high)	{
		if(low<high) {

			int p = partition(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);	
		}

	}

	public static void main(String args[]) {
		
		int arr[] = new int[] {10,9,5,20,3,50};
		int low  = 0;
		int high = arr.length-1;
		quickSort(arr,low,high);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]+" ");
		
		
	}

}
