class Solution {
    public boolean wordPattern(String pattern, String s) {
        //spitted the string, convert into an array
        String[] arrOfS = s.split(" ");
        
        //take an answer boolean
         boolean ans = true;
        
        if(pattern.length() != arrOfS.length){
            return false;
        }
        HashMap <Character, String> hash = new HashMap<>();
        for(int i = 0; i<pattern.length(); i++){
            if(hash.containsKey(pattern.charAt(i))){
                if(hash.get(pattern.charAt(i)).equals(arrOfS[i]) == false){
                    ans = false;
                }
            }
            else{
                hash.put(pattern.charAt(i), arrOfS[i]);
            }            
        }
        
        HashMap <String, Character> map = new HashMap<>();
        for(int i = 0; i<arrOfS.length; i++){
            if(map.containsKey(arrOfS[i])){
                if(map.get(arrOfS[i]).equals(pattern.charAt(i)) == false){
                    ans = false;
                }
            }
            else{
                map.put(arrOfS[i], pattern.charAt(i));
            }            
        }
        
        
        return ans; 
    }
}