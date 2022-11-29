class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //brute force solution --O(n) time complexity
        int max = arr[0];
        int ans = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
                ans = i;
            }
            
        }
        
        return ans;
    }
}