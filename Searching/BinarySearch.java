import java.io.*;

import java.util.*;

public class BinarySearch {



public static void main(String args[]){
int arr[] = new int[] {1,2,3,4,5};

int low = 0;
int hi = arr.length-1;
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

//binarySearch(arr,n);

while(low<=hi){

int mid = ((low+hi)/2);
if(arr[mid] < n){
low = mid+1;
}

else if(arr[mid]==n) {
System.out.println(mid);
break;
}
else {
hi = mid-1;
}

}

}

}
