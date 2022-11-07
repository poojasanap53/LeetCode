class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ct = 0 ;
        int max = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == 0){
                ct = 0;
            }
            else{
                ct++;
                if(ct> max){
                        max = ct;
                }
            }
        }
         
        
        return max;
    }
}