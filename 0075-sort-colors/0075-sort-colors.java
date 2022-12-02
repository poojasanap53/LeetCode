class Solution {
    public void sortColors(int[] nums) {
        //bruteforce approach
        int r = 0;
        int w = 0;
        int b = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                r++;
            }
            if(nums[i] == 1){
                w++;
            }
            if(nums[i] == 2){
                b++;
            }
        }
        
        for(int i = 0; i < r; i++){
            nums[i] = 0;
        }
        for(int j = r; j< r + w; j++){
            nums[j] = 1;
        }
        for(int k = r+w; k < r+ w+ b; k++){
            nums[k] = 2;
        }
    }
}