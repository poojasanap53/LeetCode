class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hash1 = new HashSet<>();
        for (int j : nums1) {
            hash1.add(j);
        }
        HashSet<Integer> hash2 = new HashSet<>();
        for (int j : nums2) {
            hash2.add(j);
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        for(int ele : hash1){
            if(hash2.contains(ele)){
                list.add(ele);
            }
        }
        
        int[] ans = new int[list.size()];
        int i = 0;
        for(int ele : list){
            ans[i++] = ele;
        }
        
        return ans;
    }
}