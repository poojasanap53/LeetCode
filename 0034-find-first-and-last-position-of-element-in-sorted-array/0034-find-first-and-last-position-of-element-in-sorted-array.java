class Solution {
    public int[] searchRange(int[] nums, int target) {
        //using binary search 
        int [] ans = {-1, -1};
        
        //for first occurence
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans[0] = mid;
                end = mid - 1;    
            }
        }
        
        // for last occurence
        start = 0;
        end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans[1] = mid;
                start = mid + 1;          
            }
        }
        
        return ans;
        
    }
}