class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        
        List<Integer> ans = new ArrayList<>();
         for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
            if(mapElement.getValue() == 2){
                ans.add(mapElement.getKey());
            }
        }
        
        return ans;
    }
}