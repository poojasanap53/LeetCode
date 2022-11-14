class Solution {
    public int[] sortArrayByParity(int[] nums) {
        boolean swapped = true;
        for(int j = 0; j<nums.length-1; j++){
            swapped = false;
            for(int i= 0; i<nums.length - 1; i++){
                if(nums[i] % 2 != 0){
                    int temp = nums[ i + 1] ;
                    nums[ i + 1 ] = nums[i];
                    nums[i] = temp;
                    swapped = true;
                }
            }
            
            if (swapped==false){
             break;
            }
        }  
        
        return nums;
    }
}