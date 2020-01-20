import java.io.*;
import java.util.*;



class Sort012 {

	static int[] sortArray(int[]arr) {

		int low =0;
		int high = arr.length-1;
		int mid =0;
		int temp =0;

		while(mid<=high) {
		switch(arr[mid]) {

		case 0 :	{
			
			temp = arr[low];
			arr[low]= arr[mid];
			arr[mid] = temp;
			mid++;
			low++;
			break;
		}

		case 1: {
			mid++;
			break;
		}


		case 2:	{
			temp = arr[mid];
			arr[mid] = arr[high];
			arr[high]= temp;
			high--;
			break;
		}
		}

			
		}


		return arr;
	}

	public static void main(String args[]) {


		int arr[] = new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		sortArray(arr);
		for(int i =0;i<arr.length;i++)
		System.out.print(" "+arr[i]);
		
	}

} 
