class Solution {
    public int findNumbers(int[] nums) {
        int ct = 0;
        
        for(int i = 0; i < nums.length; i++){
            int numct = 0;
            while(nums[i] > 0 ){
                numct++;
                nums[i] /= 10;
            }
            
            if(numct % 2 == 0){
                ct++;
            }
        }
        
        
        
        return ct;
    }
}