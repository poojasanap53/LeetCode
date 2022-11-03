class Solution {
    public int xorOperation(int n, int start) {
        //declaring an array nums of size n 
        int [] nums = new int[n];
        
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            //getting the elements of the array 
            nums[i] = start + 2 * i;
            //calculating xor value
            ans ^= nums[i];
        }
        
        return ans;
    }
}