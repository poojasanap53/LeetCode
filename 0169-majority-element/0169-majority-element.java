class Solution {
    public int majorityElement(int[] nums) {
        //brute force approach
        Arrays.sort(nums);
        
        return nums[nums.length /2];
    }
}