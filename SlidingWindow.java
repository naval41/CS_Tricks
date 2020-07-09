/**
Given an array of integers of size ‘n’. Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.

Input  : arr[] = {1, 7, 6, 10, 23, 3, 1, 0, 20},   k = 4 ​
Output : 46  {7,6,10,23}

*/


class Solution {
    public int[] maxSum(int[] arr, int k) {
        // Calculate Sum of initial Window.
        int res = 0; 
        for (int i=0; i<k; i++) 
           res += arr[i]; 
       
        // Compute sums of remaining windows by 
        // removing first element of previous 
        // window and adding last element of  
        // current window. 
        int curr_sum = res; 
        for (int i=k; i<n; i++) 
        { 
           curr_sum += arr[i] - arr[i-k]; 
           res = Math.max(res, curr_sum); 
        } 
       
        return res; 
    }
}
