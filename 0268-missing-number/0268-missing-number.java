class Solution {
    public int missingNumber(int[] nums) {
        HashSet <Integer> hash = new HashSet<>();
        for(int i = 0; i<nums.length ; i++){
            hash.add(nums[i]);
        }
        for(int i = 0; i<=nums.length ; i++){
            if(hash.contains(i) == false){
                return i;
            }
        }
        return -1;
    }
}