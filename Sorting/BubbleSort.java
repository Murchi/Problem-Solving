import java.io.*;
import java.util.*;


public class BubbleSort {


static void bubbleSort(int arr[]) {

	for(int i =0; i<arr.length-1;i++) {

		for(int j=0;j<arr.length-i-1;j++) {

			if(arr[j]>arr[j+1]) {
				
				int temp = arr[j];
				arr[j]	= arr[j+1];
				arr[j+1] = temp;			

			}
		}
	}

}

public static void main(String args[]) {

int arr[] = new int[]{5,2,10,30,1,6};
bubbleSort(arr);
for(int i=0;i<arr.length;i++) {

	System.out.println(arr[i]+" ");
}


}

}
