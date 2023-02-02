class Solution {
    public int repeatedNTimes(int[] nums) {
        // add all elements in hashmap along with their frequency 
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        
        // iterate through hashmap and check if value is equal to n, and return the key of such value
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
            if(mapElement.getValue() == nums.length/2){
                return mapElement.getKey();
            }
        }
        
        return 0;
    }
}