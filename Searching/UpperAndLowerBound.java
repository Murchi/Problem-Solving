import java.io.*;
import java.util.*;


public class UpperAndLowerBound {

public static int findlowerBound(int arr[] , int val){

int low =0;
int high = arr.length-1;
int ans = -1;

while(low <= high){

	int mid = (low+high)/2;
	if(arr[mid] == val){

		ans = mid;
		high = mid-1;
	}
	else if(arr[mid]>val){
	
		high = mid-1;
	}
	else {
		low = mid+1;
	}
	
}
return ans;

}

public static int findUpperBound(int arr[], int val){

int low =0;
int high = arr.length-1;
int ans = -1;

while(low <= high){

        int mid = (low+high)/2;
        if(arr[mid] == val){

                ans = mid;
                low = mid+1;
        }
        else if(arr[mid]>val){

                high = mid-1;
        }
        else {
                low = mid+1;
        }

}
return ans;

}


public static void main(String args[]){

	int arr[] = new int[] {1,2,2,3,3,3,4};
	int low = findlowerBound(arr,2);
	int high = findUpperBound(arr,3);
	System.out.println(low);
	System.out.println(high);
	
}


}
