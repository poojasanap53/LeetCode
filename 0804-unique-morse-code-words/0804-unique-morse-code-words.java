class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        // create an array to store codes
        String[] alpha = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        // using map, each letter is mapped with the code
        HashMap <Character, String> map = new HashMap<>();
        char c = 'a';
        for(int i = 0; i < alpha.length; i++){
            map.put(c, alpha[i]);
            c++;
        }
        
        //in order to get distinct counts, we take set 
        HashSet <String> hs = new HashSet<>();
        // iterate through words array, and from the hashmap get the codes 
        for(int i = 0; i <words.length; i++){
            String ans = "";
            for(int j = 0; j < words[i].length(); j++){
                ans += map.get(words[i].charAt(j)); 
            }
            hs.add(ans);
        }
        
        
        return hs.size();
     }
}