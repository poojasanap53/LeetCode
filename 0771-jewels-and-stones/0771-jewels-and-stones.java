class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        //take all jewels in a hashmap
        for(int i = 0; i<jewels.length(); i++){
            map.put(jewels.charAt(i), 1);
        }
        
        //take a count varaible 
        int ct = 0;
        
        //check if the elements in stones are alrready present in hashmap 
        for(int i = 0; i<stones.length(); i++){
            //if present increse the count by 1
            if(map.containsKey(stones.charAt(i))){
                ct++;
            }
        }
        
        //return the count
        return ct;
    }
}