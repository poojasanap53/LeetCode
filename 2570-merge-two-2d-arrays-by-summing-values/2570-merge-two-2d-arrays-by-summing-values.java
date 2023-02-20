class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i <nums1.length; i++){
            if(map.containsKey(nums1[i][0])){
                map.put(nums1[i][0], map.get(nums1[i][0]) + nums1[i][1]);
            }
            else{
                map.put(nums1[i][0], nums1[i][1]);
            }
        }
        for(int i = 0 ; i <nums2.length; i++){
            if(map.containsKey(nums2[i][0])){
                map.put(nums2[i][0], map.get(nums2[i][0]) + nums2[i][1]);
            }
            else{
                map.put(nums2[i][0], nums2[i][1]);
            }
        }
        
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(map);
        // sortedMap.putAll(map);
        // sortedMap.entrySet();
        
        int[][] ans = new int[map.size()][2];
        int i = 0;
        for(Map.Entry<Integer, Integer> val : sortedMap.entrySet()){
            ans[i][0] = val.getKey();
            ans[i][1] = val.getValue();
            i++;
        }
        
        
        return ans;
        
    }
}