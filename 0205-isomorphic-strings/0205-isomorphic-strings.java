class Solution {
    public boolean isIsomorphic(String s, String t) {
        //created a hashmap 
        HashMap<Character, Character> map = new HashMap<>();
        //take a boolean value for the answer
        boolean ans = true;
        
        //now loop through the strings, and hash values in map
        for(int i = 0; i <s.length() ; i++){
            // if the key is duplicated, check if the value is same or not 
            // if values are not same then it is not isomorphic string
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)){
                     ans = false;
                }
            }
            // if key is not present, then just add into map
            else{
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        
         HashMap<Character, Character> map2 = new HashMap<>();
        for(int i = 0; i <t.length() ; i++){
            if(map2.containsKey(t.charAt(i))){
                if(map2.get(t.charAt(i)) != s.charAt(i)){
                     ans = false;
                }
            }
            else{
                map2.put(t.charAt(i), s.charAt(i));
            }
        }
        
        // System.out.println(map);
        // System.out.println(map2);
                           
        return ans;
    }
}