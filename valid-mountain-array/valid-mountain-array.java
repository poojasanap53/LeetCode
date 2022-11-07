class Solution {
    public boolean validMountainArray(int[] arr) {
        int peak = 0;
        int n = arr.length;
        
        while(peak+1 < n && arr[peak] <arr[peak+1]){
            peak++;
        }    
        
        if(peak==0 || peak == n- 1)
            return false;
        
        while(peak + 1< n && arr[peak] > arr[peak + 1])
            peak++;
        
        
        return peak == n-1;
    }
}