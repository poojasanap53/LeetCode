class Solution {
    public int[] rearrangeArray(int[] nums) {
        //brute force approach - O(n) - time complexity 
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < 0){
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }
        }
        
        int posi = 0;
        for(int i = 0; i<nums.length; i+=2){
            nums[i] = pos.get(posi);
            posi++;
        }
        int negi = 0;
        for(int i = 1; i<nums.length; i+=2){
            nums[i] = neg.get(negi);
            negi++;
        }
        
        
        return nums;
    }
}