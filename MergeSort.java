/* Program to sort an array using merge sort */



import java.util.*;
import java.io.*;

public class MergeSort {



void merge(int arr[],int l,int m,int r) {

int n1 = m-l+1;
int n2 = r-m;



//System.out.println(n1);
//System.out.println(n2);

int Left[] = new int[n1];
int Right[] = new int[n2];


for(int i=0;i<n1;++i) {
Left[i]= arr[l+i];

}

for( int j=0;j<n2;++j) {
Right[j]= arr[m+1+j];
}

int i=0;
int j=0;
int k=l;
while(i<n1 && j<n2) {

if(Left[i]<=Right[j]) {
arr[k] = Left[i];
i++;
}

else {
arr[k]=Right[j];
j++;
}
k++;
}

while(i<n1) {
arr[k]=Left[i];
i++;
k++;
}

while(j<n2) {
arr[k]= Right[j];
j++;
k++;
}


}

public void sortArray(int [] arr,int l,int r) {
if(l<r) {

int m = (l+r)/2;

sortArray(arr,0,m);
sortArray(arr,m+1,r);

merge(arr,l,m,r);
}

}


public static void main(String args[]) {

int arr[] = {5,6,1,90,7,2};

MergeSort sort = new MergeSort();
sort.sortArray(arr,0,arr.length-1);

for(int i=0;i<arr.length;i++) {
System.out.println(arr[i]);
}

}

}
