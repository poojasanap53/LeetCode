class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //take enteries of integers in hashmap along with their frequency 
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        
        // for sum, iterate through hashmap, check the value and add it to the sum 
        int sum = 0;
        for(Map.Entry<Integer, Integer> val : map.entrySet()){
            if(val.getValue() == 1){
                sum += val.getKey();   
            }
            
        }
        
        
        return sum;
        
    }
}