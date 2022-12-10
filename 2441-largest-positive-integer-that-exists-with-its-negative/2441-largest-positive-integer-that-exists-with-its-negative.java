class Solution {
    public int findMaxK(int[] nums) {
        //bruteforce approach - O(n2) 
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i <nums.length; i++){
           for(int j = 0; j <nums.length; j++){
              if(nums[i] == -nums[j]){
                  if(nums[i] < 0){
                    ans.add(nums[i] * - 1);
                  }
                  else{
                    ans.add(nums[i]);
                  }
              } 
           }
        }  
        
        Collections.sort(ans);
        
        if(ans.size() > 0){
            return ans.get(ans.size() - 1);
        }
        
        return -1;
    }
}