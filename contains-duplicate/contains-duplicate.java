class Solution {
    public boolean containsDuplicate(int[] nums) {
    Set<Integer> hashset = new HashSet<>();
    for (int key : nums) {
        if (hashset.contains(key)) {
            return true;
        }
        hashset.add(key);
    }
    return false;
    }
}