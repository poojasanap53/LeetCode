class Solution {
    public int findNumbers(int[] nums) {
        int ct = 0;
        for(int i = 0; i<nums.length; i++){
            int num = String.valueOf(nums[i]).length();
            if(num % 2 == 0){
                ct++;
            }
        }
        
        return ct;
    }
}