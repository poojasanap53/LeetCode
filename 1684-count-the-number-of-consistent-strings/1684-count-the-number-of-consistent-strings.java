class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        //add the allowed letters in a set
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++){
            hs.add(allowed.charAt(i));
        }
        
        // now  iterate through words, and check if char in strings of words  are in hashset
        int ct = 0;
        for(int i = 0 ; i < words.length; i++){
            for(int j = 0; j <words[i].length(); j++){
                // if chars are not present in hashset increase the count by 1
                if(!hs.contains(words[i].charAt(j))){
                    ct++;
                    break;
                }
            }
        }
        
        // return words lenght minus count, as it gives the number of consistent strings
        return words.length - ct;
    }
}