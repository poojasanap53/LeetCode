class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //create a hashmap
        HashMap <Integer, Integer> map = new HashMap<>();
        //take length of nums array
        int l = nums.length;
        // create an ans list
        List<Integer> ans = new ArrayList<>();
        
        //iterate through each ele in nums array
        for(int n : nums){
            //get hashtable for them
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }
        }
        
        // System.out.println(map);
        
        //iterate through the hash map, and check if any value is greater than l/3 if yes then add it to ans list
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
            if(mapElement.getValue() > (l/3)){
                ans.add(mapElement.getKey());
            }
        }
        
        
        return ans;
    }
}