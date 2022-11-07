class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for(int i = 0; i<length;){
            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[length - 1];
                nums[length - 1] = temp;
                
                length--;
            }
            else{
                i++;
            }
        }
        
        return length;
    }
}