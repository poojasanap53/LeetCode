class Solution {
    public String decodeMessage(String key, String message) {
        HashMap <Character, Character> map = new HashMap<>();
        
        // take character to start aplha series
        char t = 'a';
        //loop through key's each char
        for(int i = 0; i<key.length();i++){
            // if char is not equal to ' ' then check if its char first occurence or not
            if(key.charAt(i) != ' '){
                // if it is char's first occurence, add it to hashmap else leave
                if(!map.containsKey(key.charAt(i))){
                    map.put(key.charAt(i), t);
                    t++;
                }
            }
            // also put for spaces
            map.put(' ', ' ');
            
            
        }
        
        System.out.println(map);
        
        String ans = "";
        //loop htrough message 
        for(int i = 0; i < message.length(); i++){
            //append to the string the hashed values
            ans += map.get(message.charAt(i));
        }
        
        return ans;
    }
}