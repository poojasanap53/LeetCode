class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        // in hashmap, add all the letters with their frequency
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
    
        // take num integer, and store the frequency of first letter 
        int num = map.get(s.charAt(0));
        // iterate through map and check if the frequency matches other values
        for(Map.Entry<Character, Integer> val : map.entrySet()){
            if(val.getValue() != num){
                return false;
            }
        }
        
        return true;
    }
}