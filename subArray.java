// Java implementation of the approachi
//reference : geeksforgeeks

/*Number of subarrays having absolute sum greater than K*/
 

import java.util.*; 

  

class subArray  
{ 

      

static int maxLen = 30; 

  

  
// Function to find required value 

static int findCnt(int arr[], int n, int k) 
{ 

    // Variable to store final answer 

    int ans = 0; 

  

    // Loop to find prefix-sum 

    for (int i = 1; i < n; i++) 

    { 

        arr[i] += arr[i - 1]; 

        if (arr[i] > k || arr[i] < -1 * k) 

            ans++; 

    } 

  

    if (arr[0] > k || arr[0] < -1 * k) 

        ans++; 

  

    // Sorting prefix-sum array 

    Arrays.sort(arr); 

  

    // Loop to find upper_bound 

    // for each element 

    for (int i = 0; i < n; i++) 

        ans += n - upper_bound(arr, 0, n, arr[i] + k); 

  

    // Returning final answer 

    return ans; 
} 

  

static int upper_bound(int[] a, int low,  

                    int high, int element) 
{ 

    while(low < high) 

    { 

        int middle = low + (high - low)/2; 

        if(a[middle] > element) 

            high = middle; 

        else

            low = middle + 1; 

    } 

    return low; 
}  

  
// Driver code 

public static void main(String[] args)  
{ 

    int arr[] = { -1, 4, -5, 6 }; 

    int n = arr.length; 

    int k = 0; 

  

    // Function to find required value 

    System.out.println(findCnt(arr, n, k)); 
} 
} 
