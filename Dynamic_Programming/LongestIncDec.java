/*Question : InterviewBit : Given an array of integers, A of length N, find the length of longest subsequence which is first increasing then decreasing.

Eg : Input 1:
    A = [1, 2, 1]

Output 1:
    3
*/

import java.io.*;
import java.util.*;


class LongestIncDec {


public static int lenincdec(int arr[],int len) {

int lis[]= new int[len];
int dis[] = new int[len];

for(int i=0;i<len;i++) {
lis[i]=1;
dis[i]=1;
}


for(int i=1;i<len;i++) {

for(int j=0;j<i;j++) {
if(arr[i]>arr[j] && lis[i]<lis[j]+1) {

lis[i]=lis[j]+1;
}

}
}


for(int i = len-2;i>=0;i--) {
for(int j=len-1;j>i;j--) {

if(arr[i]>arr[j] && dis[i]<dis[j]+1) {

dis[i]= dis[j]+1;
}
}
}

int mx = lis[0]+dis[0]-1;

for(int i=0;i<len;i++) {
mx=Integer.max(mx,lis[i]+dis[i]-1);
}
return mx;

}

public static void main(String args[]) {


int arr[] = {1, 11, 2, 10, 4, 5, 2, 1};
int len = arr.length;

System.out.println("Length is "+lenincdec(arr,len));
}


}
