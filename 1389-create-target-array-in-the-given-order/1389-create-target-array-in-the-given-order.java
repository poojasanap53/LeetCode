class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            ls.add(index[i], nums[i]);
        }
       
        for(int i = 0; i <ls.size(); i++){
            target[i] = ls.get(i);
        }
        
        return target;
    }
}